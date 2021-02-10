package com.example.demoswaggerapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Beers" , description = "Beers operations", authorizations ={ @Authorization(value = "BasicAuth")} )
public class BeersController  implements BeersApi {


}
