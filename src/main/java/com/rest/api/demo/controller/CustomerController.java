package com.rest.api.demo.controller;


import com.rest.api.demo.model.CustomerDto;
import com.rest.api.demo.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/customers")
public class CustomerController {

    private final CustomerService customerService ;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomers(){
        return new ResponseEntity<>(
                customerService.getAllCustomers(), HttpStatus.OK
        );
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Long id){
        return new ResponseEntity<>(
                customerService.getCustomerById(id),HttpStatus.OK
        );
    }

    @GetMapping(value = "/lastName/{lastName}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable String lastName){
        return new ResponseEntity<>(
                customerService.getCustomerByLastName(lastName),HttpStatus.OK
        );
    }

}
