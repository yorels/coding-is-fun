package com.yorels.service;

import com.yorels.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
public interface CustomerService {

    List<Customer> findAll();

}
