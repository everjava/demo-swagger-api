package com.example.demoswaggerapi.controller;


import com.example.demoswaggerapi.controller.CustomersApi;
import com.example.demoswaggerapi.model.Address;
import com.example.demoswaggerapi.model.Customer;
import com.github.javafaker.Faker;
import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Api(tags = "Customers", description = "Customer operations"  )
public class CustomerController implements CustomersApi {


    @Override
    public ResponseEntity<Customer> getCustomerByIdV1(UUID customerId) {
        Faker faker = new Faker();
        Customer customer = new Customer();
        Address address = new Address();
        address.setCity(faker.address().city());
        address.setStateCode(Address.StateCodeEnum.CA);
        address.setZipCode("88000");
        address.setLine1(faker.address().fullAddress());
        customer.setAddress(address);
        customer.setFirstName(faker.name().firstName());
        customer.setLastName(faker.name().lastName());
        return ResponseEntity.ok(customer);
    }
}
