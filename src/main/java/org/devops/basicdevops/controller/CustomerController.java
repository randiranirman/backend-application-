package org.devops.basicdevops.controller;


import lombok.RequiredArgsConstructor;
import org.devops.basicdevops.dto.CustomerDto;
import org.devops.basicdevops.repository.CustomerRepository;
import org.devops.basicdevops.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/api")
@RequiredArgsConstructor

@CrossOrigin("*")



public class CustomerController {


    private  final CustomerService customerService;




      @PostMapping("/customer")

      @ResponseStatus(HttpStatus.OK)
      private CustomerDto createCustomer(@RequestBody CustomerDto  request) {


          var customerResponse = customerService.createCustomer(request);


          return customerResponse;

      }

      @GetMapping("/customer/{email}")
        @ResponseStatus( HttpStatus.OK
        )

        private CustomerDto  getCustomerByEmail(@PathVariable String email ) {

          return customerService.getCustomerByEmail(email);

      }




}
