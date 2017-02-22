package com.yorels.app;

import com.yorels.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yorels on 2017-02-21.
 */
public class Application {

    public static void main (String []args) {

        System.out.println("Running App..........");

        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        CustomerService service = appContext.getBean("service", CustomerService.class);

        System.out.println("\t\t\t" + service.findAll().get(0).getFirstname());
        System.out.println("End App..............");

    }

}
