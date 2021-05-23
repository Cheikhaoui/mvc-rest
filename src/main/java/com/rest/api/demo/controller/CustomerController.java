package com.rest.api.demo.controller;


import com.rest.api.demo.model.CustomerDto;
import com.rest.api.demo.service.CustomerService;
import com.rest.api.demo.service.RessourceNotFoundException;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "this is Customer WebService yeaaah")
@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    private final CustomerService customerService ;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerDto> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto getCustomerById(@PathVariable Long id){
        CustomerDto customerDto = customerService.getCustomerById(id);
        if(customerDto == null){
            throw new RessourceNotFoundException("I can't found a Customer with the id " +
                    id);
        }
        else {
            return customerDto;
        }
    }

    @GetMapping(value = "/lastName/{lastName}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto getCustomerById(@PathVariable String lastName){
        return
                customerService.getCustomerByLastName(lastName);
    }

    @PostMapping(value = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto){
       return customerService.saveOrUpdateCustomer(customerDto);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto){
        return customerService.saveOrUpdateCustomer(customerDto);
    }

    @PatchMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto patchCustomer(@RequestBody CustomerDto customerDto){
        return customerService.patchCustomer(customerDto);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@RequestBody CustomerDto customerDto){
                customerService.deleteCustomer(customerDto);
    }
}
