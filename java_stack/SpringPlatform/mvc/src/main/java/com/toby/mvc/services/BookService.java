package com.toby.mvc.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.toby.mvc.Repository.BookRepository;
import com.toby.mvc.models.Book;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    public Book updateBook(Long id,  String title,  String desc, String lang, Integer numOfPages) {
    	Book updateBook= bookRepository.findById(id).get();
    	updateBook.setTitle(title);
    	updateBook.setDescription(desc);
    	updateBook.setLanguage(lang);
    	return bookRepository.save(updateBook);
    	
    }
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
   
    }
    
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}


