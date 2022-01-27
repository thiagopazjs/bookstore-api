package com.thiago.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.bookstore.domain.Books;

@Repository
public interface CategoryRepository extends JpaRepository<Books, Integer>{

}
