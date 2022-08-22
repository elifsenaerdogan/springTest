package com.firstProject.elifSena.controller;

import com.firstProject.elifSena.entity.Books;
import com.firstProject.elifSena.services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/book")
public class BooksController {
    @Autowired
    BooksServices booksService;

    @PostMapping(value="/save",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Books> saveBooks(@RequestBody Books book){

        Books saveBook=booksService.saveBooks(book);
        return new ResponseEntity<Books>(saveBook, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Books>> getAllBooks(){
        List<Books> allBooks = booksService.getAllBooks();
        return new ResponseEntity<List<Books>>(allBooks,HttpStatus.OK);
    }

    @GetMapping(value="/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Books> getBooksById(@PathVariable (name="id")Long bookId){
        Books book = booksService.getBooksById(bookId);
        return new ResponseEntity<Books>(book,HttpStatus.OK);
    }

    @PutMapping(value="/update/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Books> updateBooksById(@RequestBody Books book){
        Books updatedBooks = booksService.updateBooks(book);
        return new ResponseEntity<Books>(updatedBooks,HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBooksById(@PathVariable(name="id")Long bookId){
        booksService.deleteBooksById(bookId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }




}
