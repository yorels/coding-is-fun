import com.yorels.service.CustomerService;
import com.yorels.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yorels on 2017-02-21.
 */
public class Application {

    public static void main (String []args) {

        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Running app.........");
        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println("\t\t\t" + service.findAll().get(0).getFirstname());
        System.out.println("End app.............");
    }

}
