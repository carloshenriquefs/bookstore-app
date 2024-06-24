package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {
}
