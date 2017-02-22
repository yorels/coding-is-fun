package com.yorels.dev;

import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}
