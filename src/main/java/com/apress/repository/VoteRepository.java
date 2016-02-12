package com.apress.repository;

import com.apress.domain.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by cwastchak on 1/7/2016.
 */
@Component
public interface VoteRepository extends CrudRepository<Vote, Long> {
    @Query(value = "select v.* from Option o, Vote v where o.POLL_ID = ?1 AND v.OPTION_ID = o.OPTION_ID", nativeQuery = true)
    public Iterable<Vote> findVotesByPoll(Long pollId);
}
