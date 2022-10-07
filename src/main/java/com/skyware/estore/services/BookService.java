package com.skyware.estore.services;
import com.skyware.estore.models.Book;
import com.skyware.estore.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class BookService implements IBookService
{
    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book SaveBook(Book book)
    {
        book.setCreateDateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void DeleteBookById(Long id)
    {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> FindAllBooks()
    {
        return bookRepository.findAll();
    }
}
