package com.yorels.data.repo;

import com.yorels.data.context.PersistentContextTest;
import com.yorels.model.Author;
import com.yorels.model.Book;
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
public class BookRepositoryTest extends PersistentContextTest{

    @Test
    @Transactional
    @Commit
    public void aCreate(){

        new Book();
        Book bookExpected = new Book("123-ABC-456789", "Try Again", new Date());
        Author author = new Author(1, "Yoel", "Gallegos");

        bookExpected.setAuthors(Arrays.asList(author));

        bookRepository.save(bookExpected);
        bookRepository.flush();

        Book bookActual = bookRepository.getOne("123-ABC-456789");

        assertThat("the books names are different, should be the same",
                bookExpected.getTitle(), equalTo(bookActual.getTitle()));
    }

    @Test
    public void findAllBooks() {
        List<Book> books = bookRepository.findAll();
        assertThat("this should not be empty", books, is(not(empty())));
    }

}
