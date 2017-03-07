package com.yorels.data.context;

import com.yorels.data.config.PersistenceJPAConfig;
import com.yorels.data.repo.BooksRepository;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yoel.gallegos on 06/03/2017.
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceJPAConfig.class)
public class PersistentContextTest {

    @Autowired
    protected BooksRepository bookRepository;

}
