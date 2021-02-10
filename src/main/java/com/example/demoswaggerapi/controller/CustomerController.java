package com.example.demoswaggerapi.controller;


import com.example.demoswaggerapi.controller.CustomersApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Customers", description = "Customer operations", authorizations ={ @Authorization(value = "BasicAuth")} )
public class CustomerController implements CustomersApi {


}
