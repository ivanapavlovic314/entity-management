package com.springframework.entitymanagement.repositories;

import com.springframework.entitymanagement.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
