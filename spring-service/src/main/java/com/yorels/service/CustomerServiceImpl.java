package com.yorels.service;

import com.yorels.data.CustomerRepository;
import com.yorels.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
@Service("service")
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    @Autowired
    public void customerRepository(CustomerRepository customerRepository) {
        System.out.println("setter component scan");
        this.customerRepository = customerRepository;
    }
/*
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("constructor component scan");
        this.customerRepository = customerRepository;
    }
*/
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}
