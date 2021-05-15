package com.rest.api.demo.model.mapper;

import com.rest.api.demo.domain.Customer;
import com.rest.api.demo.model.CustomerDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerDto customerEntityToDto(Customer customer);
    List<CustomerDto> customersEntitiesToDto(List<Customer> customers);
    Customer dtoToEntity(CustomerDto customerDto);
}
