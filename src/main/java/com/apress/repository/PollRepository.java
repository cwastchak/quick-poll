package com.apress.repository;

import com.apress.domain.Poll;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cwastchak on 1/7/2016.
 */
public interface PollRepository extends CrudRepository<Poll, Long> {
}
