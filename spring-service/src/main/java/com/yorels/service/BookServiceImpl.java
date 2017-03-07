package com.yorels.service;

import com.yorels.data.repo.BooksRepository;
import com.yorels.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yoel.gallegos on 07/03/2017.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Book> findAll(){
        return booksRepository.findAll();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return booksRepository.findByTitle(title);
    }
}
