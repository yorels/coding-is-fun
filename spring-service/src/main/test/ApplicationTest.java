import com.yorels.dev.CustomerService;
import com.yorels.dev.CustomerServiceImpl;
import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by yoel.gallegos on 21/02/2017.
 */

public class ApplicationTest {

    @Test
    public void findFirstElementTest(){
        CustomerService service = new CustomerServiceImpl();
        Assert.assertEquals(service.findAll().get(0).getFirstname(), "Yorels");
    }

}
