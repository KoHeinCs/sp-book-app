package com.zawmoehtike.spbookstoreapp.repository;

import com.zawmoehtike.spbookstoreapp.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
