package com.yorels.data;

import com.yorels.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
@Repository("hibernateRepo")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${predator}")
    private String predator;

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname(predator);
        customers.add(customer);

        return customers;
    }

}
