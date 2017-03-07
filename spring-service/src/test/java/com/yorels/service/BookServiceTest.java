package com.yorels.service;

import com.yorels.model.Book;
import com.yorels.service.config.ServiceConfigTest;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by yoel.gallegos on 07/03/2017.
 */
public class BookServiceTest extends ServiceConfigTest{

    private String BOOK_TITLE = "Try";

    @Test
    public void findAll() {
        assertThat("this should not be empty", bookService.findAll(), is (not (empty())));
    }

    @Test
    public void findByTitle(){

        List<Book> books = bookService.findByTitle(BOOK_TITLE);

        books.forEach(book -> {
            String titleActual = book.getTitle();
            System.out.println(titleActual);
            assertThat("title retrived should match title requested", BOOK_TITLE, equalToIgnoringCase(titleActual));
        });
    }

}

