package org.devops.basicdevops.service;


import lombok.RequiredArgsConstructor;
import org.devops.basicdevops.dto.CustomerDto;
import org.devops.basicdevops.model.Customer;
import org.devops.basicdevops.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service

@RequiredArgsConstructor


public class CustomerService {

    private final CustomerRepository customerRepository;




    public  CustomerDto createCustomer( CustomerDto customerDto){
        if( customerRepository.existsByEmail(customerDto.email())){

            throw new RuntimeException("Uesr alredy exists");

        }

        var customer = new Customer();





        customer.setEmail(customerDto.email());
        customer.setName(customerDto.name());
        customer.setUsername(customerDto.username());

        customer.setPhoneNumber(customerDto.phoneNumber());



        customerRepository.save(customer);

        return  new CustomerDto(customer.getName() ,customer.getEmail() , customer.getUsername(), customer.getPhoneNumber() );



    }

    public CustomerDto getCustomerByEmail(String email) {


        var customer =customerRepository.getCustomerByEmail(email);


        return new CustomerDto( customer.getName(), customer.getEmail(), customer.getUsername(), customer.getPhoneNumber())
;

    }


}
