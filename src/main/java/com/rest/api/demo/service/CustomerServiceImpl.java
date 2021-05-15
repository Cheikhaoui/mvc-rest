package com.rest.api.demo.service;

import com.rest.api.demo.model.CustomerDto;
import com.rest.api.demo.model.mapper.CustomerMapper;
import com.rest.api.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository , CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerMapper.customersEntitiesToDto(customerRepository.findAll());
    }

    @Override
    public CustomerDto getCustomerByLastName(String name) {
      return   customerMapper.customerEntityToDto(customerRepository.getCustomerByLastName(name));
    }

    @Override
    public CustomerDto getCustomerById(Long id) {
        return customerMapper.customerEntityToDto(customerRepository.getCustomerById(id));
    }
}
