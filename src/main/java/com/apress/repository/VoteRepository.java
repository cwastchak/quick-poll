package com.apress.repository;

import com.apress.domain.Vote;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cwastchak on 1/7/2016.
 */
public interface VoteRepository extends CrudRepository<Vote, Long> {
}
