package com.spring.api.demo.model.mapper;

import com.spring.api.demo.domain.Customer;
import com.spring.api.demo.model.CustomerDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerDto customerEntityToDto(Customer customer);

    List<CustomerDto> customersEntitiesToDto(List<Customer> customers);

    Customer dtoToEntity(CustomerDto customerDto);
}
