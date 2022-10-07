package com.skyware.estore.repository;

import com.skyware.estore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long>
{
    // All implementation of CRUD will be privided by JPARepository
}
