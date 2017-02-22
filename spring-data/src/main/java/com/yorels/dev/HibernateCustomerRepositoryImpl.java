package com.yorels.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("Yorels");

        customers.add(customer);

        return customers;
    }

}
