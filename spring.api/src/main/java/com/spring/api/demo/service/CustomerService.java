package com.spring.api.demo.service;

import com.spring.api.demo.modelo.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getAllCustomers();

    CustomerDto getCustomerByLastName(String name);

    CustomerDto getCustomerById(Long id);

    CustomerDto saveOrUpdateCustomer(CustomerDto customerDto);

    CustomerDto patchCustomer(CustomerDto customerDto);

    void deleteCustomer(CustomerDto customerDto);
}
