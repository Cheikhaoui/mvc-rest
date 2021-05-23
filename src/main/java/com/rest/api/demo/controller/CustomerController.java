package com.rest.api.demo.controller;


import com.rest.api.demo.model.CustomerDto;
import com.rest.api.demo.service.CustomerService;
import com.rest.api.demo.service.RessourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        CustomerDto customerDto = customerService.getCustomerById(id);
        if(customerDto == null){
            throw new RessourceNotFoundException("I can't found a Customer with the id " +
                    id);
        }
        else {
            return new ResponseEntity<>(
                    customerDto, HttpStatus.OK
            );
        }
    }

    @GetMapping(value = "/lastName/{lastName}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable String lastName){
        return new ResponseEntity<>(
                customerService.getCustomerByLastName(lastName),HttpStatus.OK
        );
    }

    @PostMapping(value = "/save")
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto){
       return new ResponseEntity<>(
               customerService.saveOrUpdateCustomer(customerDto),HttpStatus.CREATED
       );
    }

    @PutMapping("/update")
    public ResponseEntity<CustomerDto> updateCustomer(@RequestBody CustomerDto customerDto){
        return new ResponseEntity<>(
                customerService.saveOrUpdateCustomer(customerDto),HttpStatus.OK
        );
    }

    @PatchMapping("/update")
    public ResponseEntity<CustomerDto> patchCustomer(@RequestBody CustomerDto customerDto){
        return new ResponseEntity<>(
                customerService.patchCustomer(customerDto),HttpStatus.OK
        );
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteCustomer(@RequestBody CustomerDto customerDto){
                customerService.deleteCustomer(customerDto);
                return new ResponseEntity<>(HttpStatus.OK);
    }
}
