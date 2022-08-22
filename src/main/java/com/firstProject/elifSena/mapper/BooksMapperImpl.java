package com.firstProject.elifSena.mapper;

import com.firstProject.elifSena.entity.Books;
import com.firstProject.elifSena.model.BooksModel;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
public class BooksMapperImpl implements BooksMapper {

    @Override
    public BooksModel entityToModel(Books book) {
        if ( book == null ) {
            return null;
        }

        BooksModel booksModel = new BooksModel();

        booksModel.setId( book.getId() );
        booksModel.setBook_name( book.getBook_name() );
        booksModel.setWriter_name( book.getWriter_name() );
        booksModel.setPublisher_name( book.getPublisher_name() );
        booksModel.setNumber_pages( book.getNumber_pages() );

        return booksModel;
    }

    @Override
    public BooksModel modelToEntity(BooksModel booksModel) {
        if ( booksModel == null ) {
            return null;
        }

        BooksModel booksModel1 = new BooksModel();

        booksModel1.setId( booksModel.getId() );
        booksModel1.setBook_name( booksModel.getBook_name() );
        booksModel1.setWriter_name( booksModel.getWriter_name() );
        booksModel1.setPublisher_name( booksModel.getPublisher_name() );
        booksModel1.setNumber_pages( booksModel.getNumber_pages() );

        return booksModel1;
    }
}
