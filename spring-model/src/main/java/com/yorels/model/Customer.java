package com.yorels.model;

/**
 * Created by yoel.gallegos on 21/02/2017.
 */
public class Customer {

    private String firstname;
    private String lastname;

    public Customer () {

    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (firstname != null ? !firstname.equals(customer.firstname) : customer.firstname != null) return false;
        return lastname != null ? lastname.equals(customer.lastname) : customer.lastname == null;

    }
*/

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

}
