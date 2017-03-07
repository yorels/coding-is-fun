import com.yorels.service.CustomerService;
import com.yorels.service.config.ServiceConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfig.class)
public class ApplicationTest {

    @Autowired
    CustomerService customerService;

    @Before
    public void setUp(){

    }

    @Test
    public void findFirstElementTest(){;
        Assert.assertNotNull(customerService.findAll().get(0).getFirstname());
    }

}
