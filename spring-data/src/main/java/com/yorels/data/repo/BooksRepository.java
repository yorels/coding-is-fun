package com.yorels.data.repo;

import com.yorels.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yoel.gallegos on 06/03/2017.
 */
public interface BooksRepository extends JpaRepository<Book,String>{

}
