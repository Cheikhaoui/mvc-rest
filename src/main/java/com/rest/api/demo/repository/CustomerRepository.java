package com.rest.api.demo.repository;

import com.rest.api.demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer getCustomerByFirstName(String firstName);
    Customer getCustomerByLastName(String lastName);
    Customer getCustomerById(Long id);
}
