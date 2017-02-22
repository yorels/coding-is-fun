import com.yorels.service.CustomerService;
import com.yorels.service.CustomerServiceImpl;

/**
 * Created by yorels on 2017-02-21.
 */
public class Application {

    public static void main (String []args) {

        System.out.println("Running app.........");
        CustomerService service = new CustomerServiceImpl();
        System.out.println("\t\t\t" + service.findAll().get(0).getFirstname());
        System.out.println("End app.........");
    }

}
