package org.devops.basicdevops.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;





@AllArgsConstructor
@NoArgsConstructor
@Data

@Table( name = "customer")


@Entity
public class Customer {



    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "customer_id")
    private Long id ;


    private String name ;
    private String email ;
    private String phoneNumber ;

    private String username  ;

    @OneToMany( mappedBy = "customer" , cascade = CascadeType.ALL)
    private List<Order> orders;



}
