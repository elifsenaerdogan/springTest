package com.firstProject.elifSena.services;


import com.firstProject.elifSena.entity.Books;
import com.firstProject.elifSena.repository.FirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServices {

    @Autowired
    FirstRepository firstRepository;

    public Books saveBooks(Books book){
        return firstRepository.save(book);
    }

    public List<Books> getAllBooks(){
        return (List<Books>) firstRepository.findAll();
    }

    public Books updateBooks(Books book){
        return firstRepository.save(book);
    }

    public Books getBooksById(Long bookId){
        return firstRepository.findById(bookId).get();
    }

    public void deleteBooksById(Long bookId){
        firstRepository.deleteById(bookId);
    }

}
