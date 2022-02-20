package com.springframework.entitymanagement.repositories;

import com.springframework.entitymanagement.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
