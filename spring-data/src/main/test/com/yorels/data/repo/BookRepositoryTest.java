package com.yorels.data.repo;

import com.yorels.data.context.PersistentContextTest;
import com.yorels.model.Author;
import com.yorels.model.Book;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by yoel.gallegos on 06/03/2017.
 */
public class BookRepositoryTest extends PersistentContextTest {

    private String BOOK_TITLE = "Try Again";
    private String BOOK_ISBN = "123-ABC-456789";
    private String AUTHOR_FIRST_NAME = "Try Again";
    private String AUTHOR_LAST_NAME = "123-ABC-456789";

    @Before
    public void setUp(){
    }

    @Test
    @Transactional
    @Commit
    public void aCreate() {

        new Book();
        Book bookExpected = new Book(BOOK_ISBN, BOOK_TITLE, new Date());
        Author author = new Author(1, AUTHOR_FIRST_NAME, AUTHOR_LAST_NAME);

        bookExpected.setAuthors(Arrays.asList(author));

        bookRepository.save(bookExpected);
        bookRepository.flush();

        Book bookActual = bookRepository.getOne(BOOK_ISBN);

        assertThat("the books names are different, should be the same",
                bookExpected.getTitle(), equalTo(bookActual.getTitle()));
    }

    @Test
    public void findAllBooks() {
        List<Book> books = bookRepository.findAll();
        assertThat("this should not be empty", books, is(not(empty())));
    }

    @Test
    public void count() {
        long booksCounter = bookRepository.count();
        assertThat("there should be at least one book", booksCounter,  greaterThan(0L));
    }

    @Test
    public void findBytitle() {
        List<Book> books = bookRepository.findByTitle(BOOK_TITLE);
        String titleActual = books.get(0).getTitle();
        assertThat("titles should be the same", titleActual, equalTo(BOOK_TITLE));
    }

}
