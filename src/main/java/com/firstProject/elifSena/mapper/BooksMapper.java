package com.firstProject.elifSena.mapper;

import com.firstProject.elifSena.entity.Books;
import com.firstProject.elifSena.model.BooksModel;
import org.mapstruct.Mapper;

@Mapper
public interface BooksMapper {
    BooksModel entityToModel(Books book);

    Books modelToEntity(BooksModel booksModel);
}
