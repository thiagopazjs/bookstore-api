package com.thiago.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.bookstore.domain.Category;

@Repository
public interface BooksRepository extends JpaRepository<Category, Integer>{

}
