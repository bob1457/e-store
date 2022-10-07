package com.skyware.estore.services;

import com.skyware.estore.models.Book;

import java.util.List;

public interface IBookService {
    Book SaveBook(Book book);

    void DeleteBookById(Long id);

    List<Book> FindAllBooks();
}
