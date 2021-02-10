package com.example.demoswaggerapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "Order Service", description = "Order service operations", authorizations ={ @Authorization(value = "BasicAuth")} )
public class OrderService implements OrderServiceApi {


}
