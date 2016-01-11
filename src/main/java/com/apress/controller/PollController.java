package com.apress.controller;

import com.apress.domain.Poll;
import com.apress.exception.ResourceNotFoundException;
import com.apress.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * Created by cwastchak on 1/7/2016. TEST
 */
@RestController
public class PollController {

    @Autowired
    private PollRepository pollRepository;

    @RequestMapping(value = "/polls", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls() {
        return new ResponseEntity<>(pollRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/polls",method = RequestMethod.POST)
    public ResponseEntity<?> createPoll(@RequestBody Poll poll) {
        poll = pollRepository.save(poll);

        //Set the location of the newly created Poll object
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newPollUri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(poll.getId())
                .toUri();
        responseHeaders.setLocation(newPollUri);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.GET)
    public ResponseEntity<?> getPoll(@PathVariable Long pollId) {
        verifyPoll(pollId);
        Poll poll = pollRepository.findOne(pollId);
        return new ResponseEntity<>(poll, HttpStatus.OK);
    }

    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
        verifyPoll(pollId);
        pollRepository.delete(pollId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.PUT)
    public ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {
        verifyPoll(pollId);
        Poll p = pollRepository.save(poll);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    protected  void verifyPoll(Long pollId) throws ResourceNotFoundException {
        Poll poll = pollRepository.findOne(pollId);
        if (poll == null) {
            throw new ResourceNotFoundException("Poll with id " + pollId + " was not found");
        }
    }
}
