package com.efu.FlashLearnCards.repository;

import com.efu.FlashLearnCards.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerRepositoryORMImpl implements CustomerRepositoryORM{

    @PersistenceContext
    private EntityManager entityManager;

        // create method getCustomerById with Customer return type and Integer as parameter.
        public Customer getCustomerById(Integer customerId) {
            Customer customer = entityManager.createQuery("SELECT c FROM Customer c WHERE c.customerId = :customerId", Customer.class)
                    .setParameter("customerId", customerId)
                    .getResultList().stream().findFirst().orElse(null);

            if(customer == null){
                return null;
            } else {
                return customer;
            }
        }

        // create method addCustomer with Integer return type and Customer as parameter.
        public void addCustomer(Customer customer) {
            entityManager.persist(customer);
        }
}
