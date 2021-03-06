package com.springframework.entitymanagement.repositories;

import com.springframework.entitymanagement.domain.Book;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>, JpaSpecificationExecutor<Book> {

}
