package com.spring.api.demo.modelo.mapper;


import com.spring.api.demo.modelo.CustomerDto;
import com.spring.api.demo.domaino.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerDto customerEntityToDto(Customer customer);

    List<CustomerDto> customersEntitiesToDto(List<Customer> customers);

    Customer dtoToEntity(CustomerDto customerDto);
}
