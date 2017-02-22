package com.yorels.data;

import com.yorels.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
public interface CustomerRepository {

    List<Customer> findAll();

}
