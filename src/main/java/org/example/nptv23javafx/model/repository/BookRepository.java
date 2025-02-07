package org.example.nptv23javafx.model.repository;

import org.example.nptv23javafx.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}