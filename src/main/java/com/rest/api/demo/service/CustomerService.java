package com.rest.api.demo.service;

import com.rest.api.demo.domain.Customer;
import com.rest.api.demo.model.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getAllCustomers();
    CustomerDto getCustomerByLastName(String name);
    CustomerDto getCustomerById(Long id);
    CustomerDto saveOrUpdateCustomer(CustomerDto customerDto);
    CustomerDto patchCustomer(CustomerDto customerDto);
    void deleteCustomer(CustomerDto customerDto);
}
