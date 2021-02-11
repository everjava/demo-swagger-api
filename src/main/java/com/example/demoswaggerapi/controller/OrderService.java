package com.example.demoswaggerapi.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "Order Service" )
public class OrderService implements OrderServiceApi {


}
