package com.firstProject.elifSena.entity;
import javax.persistence.*;

@Entity(name = "public.books")
@Table(name = "books", schema = "public")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_books")
    @SequenceGenerator(name = "seq_books", sequenceName = "public.seq_books", initialValue = 1, allocationSize = 1)
    Long id;
    private String book_name;

    private String writer_name;

    private String publisher_name;

    private int number_pages;

    public Books() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getWriter_name() {
        return writer_name;
    }

    public void setWriter_name(String writer_name) {
        this.writer_name = writer_name;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public int getNumber_pages() {
        return number_pages;
    }

    public void setNumber_pages(int number_pages) {
        this.number_pages = number_pages;
    }


}
