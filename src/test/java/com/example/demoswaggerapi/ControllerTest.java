package com.example.demoswaggerapi;


import com.example.demoswaggerapi.model.Address;
import com.example.demoswaggerapi.model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.ws.rs.core.MediaType;

//@WebMvcTest
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private Faker faker = new Faker();

    //@Test
    @DisplayName("OK Response when request sent to /v1/customers/ endpoint")
    public void shouldReturnOkOnCustomerEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/v1/customers/8f2c4c4d-6c51-493a-929a-6288a2b07b6b"))
                .andExpect(status().isOk());
    }

    //@Test
    @DisplayName("NotImplemented Response when get request sent to /v1/customers endpoint")
    public void getShouldReturnNotImplementedOnCustomerEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/v1/customers"))
                .andExpect(status().isNotImplemented());
    }

   // @Test
    @DisplayName("NotImplemented Response when post request sent to /v1/customers endpoint")
    public void postShouldReturnNotImplementedOnCustomerEndpoint() throws Exception {

          Customer customer = new Customer();
        Address address = new Address();
        address.setCity(faker.address().city());
        address.setStateCode(Address.StateCodeEnum.CA);
        address.setZipCode("88000");
        address.setLine1(faker.address().fullAddress());
        customer.setFirstName(faker.name().firstName());
        customer.setLastName(faker.name().lastName());
        customer.setAddress(address);

        mockMvc.perform(MockMvcRequestBuilders.post("/v1/customers")
                .content(asJsonString(customer))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotImplemented());
    }

   // @Test
    @DisplayName("NotImplemented Response when put request sent to /v1/customers endpoint")
    public void putShouldReturnNotImplementedOnCustomerEndpoint() throws Exception {

        Customer customer = new Customer();
        Address address = new Address();
        address.setCity(faker.address().city());
        address.setStateCode(Address.StateCodeEnum.CA);
        address.setZipCode("78000");
        address.setLine1(faker.address().fullAddress());
        customer.setFirstName(faker.name().firstName());
        customer.setLastName(faker.name().lastName());
        customer.setAddress(address);

        mockMvc.perform(MockMvcRequestBuilders.post("/v1/customers")
                .content(asJsonString(customer))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotImplemented());
    }

    //@Test
    @DisplayName("NotImplemented Response when delete request sent to /v1/customers/{id} endpoint")
    public void deleteCustomer() throws Exception
    {
        mockMvc.perform( MockMvcRequestBuilders
                .delete("/v1/customers/{id}", "8f2c4c4d-6c51-493a-929a-6288a2b07b6b") )
                .andExpect(status()
                        .isNotImplemented());
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
