package com.spring.api.demo.repository;

import com.spring.api.demo.domaino.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer getCustomerByFirstName(String firstName);

    Customer getCustomerByLastName(String lastName);

    Customer getCustomerById(Long id);

}
