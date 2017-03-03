import com.yorels.service.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by yoel.gallegos on 23/02/2017.
 */
@Configuration
@ComponentScan("com.yorels")
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer
            getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    PropertySourcesPlaceholderConfigurer p = new PropertySourcesPlaceholderConfigurer();

    /*
    @Bean(name="customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepo());
        return customerService;
    }

    @Bean(name="customerRepository")
    public CustomerRepository getCustomerRepo() {
        return new HibernateCustomerRepositoryImpl();
    }
    */

}
