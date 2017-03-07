package com.yorels.service;

import com.yorels.model.Book;

import java.util.List;

/**
 * Created by yoel.gallegos on 07/03/2017.
 */
public interface BookService {

    List<Book> findAll();

    List<Book> findByTitle(String title);

}
