package com.yorels.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yoel.gallegos on 02/03/2017.
 *
 * This test is for demonstrating the issues we might face if we Overrides only hashcode and not equals.
 *
 */
public class CustomerTest {

    Customer customer1 = new Customer();
    Customer customer2 = new Customer();

    Set<Customer> list = new HashSet<>();
    Map<Customer, Customer> mapa = new HashMap();

    @Before
    public void setUp() {
        customer1.setFirstname("Predator");
        customer2.setFirstname("Predator");
        list.add(customer1);
        list.add(customer2);
        mapa.put(customer1, customer1);
        mapa.put(customer2, customer2);
    }

    @Test
    public void hashEqualsDifferent() {
        System.out.println(customer1.hashCode());//649067465
        System.out.println(customer2.hashCode());//649067465
        System.out.println(customer1);//com.yorels.model.Customer@26affbc9
        System.out.println(customer2);//com.yorels.model.Customer@26affbc9

        //This is wrong since customer1 should be same as customer2. Based on customer.firstName field
        Assert.assertTrue(customer1.equals(customer2));
    }

    @Test
    public void testHashSetSize() {

        //This list is iterating 2 elements. That is an issue since a HashSet must have unique elements.
        for(Customer cust : list ){
            cust.getFirstname();
        }
        Assert.assertEquals(list.size(), 1);
    }

    @Test
    public void testHashMapSize() {
        Customer cust1 = mapa.get(customer1);
        System.out.println(cust1.hashCode());
        System.out.println(cust1);

        Customer cust2 = mapa.get(customer2);
        System.out.println(cust2.hashCode());
        System.out.println(cust2);

        //There is an issue here, elements should be replaced based on the key.
        Assert.assertEquals(mapa.size(), 1);
    }

}
