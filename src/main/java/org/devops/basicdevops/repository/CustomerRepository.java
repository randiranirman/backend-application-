package org.devops.basicdevops.repository;


import lombok.RequiredArgsConstructor;
import org.devops.basicdevops.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CustomerRepository  extends JpaRepository<Customer, Long> {





    boolean existsByEmail(  String email);

    Customer getCustomerById(Long customerId);

    Customer getCustomerByEmail( String email );










}
