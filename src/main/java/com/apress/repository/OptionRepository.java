package com.apress.repository;

import com.apress.domain.Option;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cwastchak on 1/7/2016.
 */
public interface OptionRepository extends CrudRepository<Option, Long> {
}
