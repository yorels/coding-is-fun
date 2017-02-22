package com.yorels.service;

import com.yorels.data.CustomerRepository;
import com.yorels.model.Customer;

import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
