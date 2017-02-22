package com.yorels.data;

import com.yorels.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
public class JPACustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("Ana");
        customer.setLastname("Pineda");

        customers.add(customer);

        return customers;
    }

}
