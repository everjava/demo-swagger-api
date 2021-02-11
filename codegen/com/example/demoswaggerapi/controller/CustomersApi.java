/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.demoswaggerapi.controller;

import com.example.demoswaggerapi.model.Customer;
import com.example.demoswaggerapi.model.CustomerPagedList;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-11T11:10:02.729335600-03:00[America/Sao_Paulo]")
public interface CustomersApi {

    Logger log = LoggerFactory.getLogger(CustomersApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @Operation(summary = "Delete Customer By ID", description = "Delete a customer by its Id value.", security = {
        @SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "JwtAuthToken")    }, tags={ "Customers" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Customer Delete"),
        
        @ApiResponse(responseCode = "404", description = "Not found") })
    @RequestMapping(value = "/v1/customers/{customerId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteCustomerV1(@Parameter(in = ParameterIn.PATH, description = "Customer Id", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CustomersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Get Customer By ID", description = "Get a single **Customer** by its Id value.", security = {
        @SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "JwtAuthToken")    }, tags={ "Customers" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found Customer", content = @Content(schema = @Schema(implementation = Customer.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found") })
    @RequestMapping(value = "/v1/customers/{customerId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Customer> getCustomerByIdV1(@Parameter(in = ParameterIn.PATH, description = "Customer Id", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"firstName\" : \"John\",\r\n  \"lastName\" : \"Thompson\",\r\n  \"address\" : {\r\n    \"zipCode\" : \"33701\",\r\n    \"city\" : \"St Pete\",\r\n    \"stateCode\" : \"AL\",\r\n    \"line1\" : \"123 main\"\r\n  },\r\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CustomersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "List Customers", description = "Get a list of customers in the system", security = {
        @SecurityRequirement(name = "BasicAuth")    }, tags={ "Customers" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of Customers", content = @Content(schema = @Schema(implementation = CustomerPagedList.class))) })
    @RequestMapping(value = "/v1/customers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<CustomerPagedList> listCustomersV1(@Parameter(in = ParameterIn.QUERY, description = "Page Number" ,schema=@Schema( defaultValue="1")) @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber, @Parameter(in = ParameterIn.QUERY, description = "Page Size" ,schema=@Schema( defaultValue="25")) @Valid @RequestParam(value = "pageSize", required = false, defaultValue="25") Integer pageSize) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"content\" : [ {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  }, {\r\n    \"firstName\" : \"John\",\r\n    \"lastName\" : \"Thompson\",\r\n    \"address\" : {\r\n      \"zipCode\" : \"33701\",\r\n      \"city\" : \"St Pete\",\r\n      \"stateCode\" : \"AL\",\r\n      \"line1\" : \"123 main\"\r\n    },\r\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\r\n  } ]\r\n}", CustomerPagedList.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CustomersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Update Customer", description = "Update customer by id.", security = {
        @SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "JwtAuthToken")    }, tags={ "Customers" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Customer Updated"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request"),
        
        @ApiResponse(responseCode = "409", description = "Conflict") })
    @RequestMapping(value = "/v1/customers/{customerId}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<Void> v1CustomersCustomerIdPut(@Parameter(in = ParameterIn.PATH, description = "Customer Id", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Customer body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CustomersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "New Customer", description = "Create a new customer", security = {
        @SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "JwtAuthToken")    }, tags={ "Customers" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Customer Created"),
        
        @ApiResponse(responseCode = "400", description = "Bad Request"),
        
        @ApiResponse(responseCode = "409", description = "Conflict") })
    @RequestMapping(value = "/v1/customers",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Void> v1CustomersPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Customer body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CustomersApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}

