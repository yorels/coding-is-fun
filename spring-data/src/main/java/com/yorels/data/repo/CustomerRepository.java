package com.yorels.data.repo;

import com.yorels.model.Customer;

import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
public interface CustomerRepository {

    List<Customer> findAll();

}
