package org.devops.basicdevops.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Table(name = "product")

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Product {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "product_id")
    private Long id;
    private String name ;
    private String  description ;
    private double price ;
    private int stock;


    @ManyToMany(mappedBy = "products")
    private List<Order> orders;







}
