package com.firstProject.elifSena.repository;

import com.firstProject.elifSena.entity.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  FirstRepository extends CrudRepository<Books,Long> {

}
