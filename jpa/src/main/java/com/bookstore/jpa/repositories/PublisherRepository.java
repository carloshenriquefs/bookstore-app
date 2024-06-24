package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
