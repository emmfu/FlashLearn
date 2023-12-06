package com.efu.FlashLearnCards.repository;

import com.efu.FlashLearnCards.entity.Customer;

public interface CustomerRepositoryORM {

    // create method getCustomerById with Customer return type and Integer as parameter.
    public Customer getCustomerById(Integer customerId);

    // create method addCustomer with Integer return type and Customer as parameter.
    public void addCustomer(Customer customer);


}
