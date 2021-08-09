package com.spring.api.demo.service;

import com.spring.api.demo.modelo.CustomerDto;
import com.spring.api.demo.modelo.mapper.CustomerMapper;
import com.spring.api.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerMapper.customersEntitiesToDto(customerRepository.findAll());
    }

    @Override
    public CustomerDto getCustomerByLastName(String name) {
        return customerMapper.customerEntityToDto(customerRepository.getCustomerByLastName(name));
    }

    @Override
    public CustomerDto getCustomerById(Long id) {
        return customerMapper.customerEntityToDto(customerRepository.getCustomerById(id));
    }

    @Override
    public CustomerDto saveOrUpdateCustomer(CustomerDto customer) {
        return customerMapper.customerEntityToDto(customerRepository.save(customerMapper.dtoToEntity(customer)));
    }

    @Override
    public CustomerDto patchCustomer(CustomerDto customerDto) {
        CustomerDto customerDto1 = customerMapper.customerEntityToDto(customerRepository.findById(customerDto.getId()).get());
        if (customerDto.getFirstName() != null) {
            customerDto1.setFirstName(customerDto.getFirstName());
        }
        if (customerDto.getLastName() != null) {
            customerDto1.setLastName(customerDto.getLastName());
        }
        return saveOrUpdateCustomer(customerDto1);
    }

    @Override
    public void deleteCustomer(CustomerDto customerDto) {
        customerRepository.delete(customerMapper.dtoToEntity(customerDto));
    }
}
