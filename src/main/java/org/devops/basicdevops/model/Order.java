package org.devops.basicdevops.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Table( name = "order")

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Order {




    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "order_id")
    private Long  id;



    @ManyToOne
    private Customer Customer;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;



    @ManyToMany
    @JoinTable(  name = "order_products" , joinColumns= @JoinColumn(  name = "order_id") , inverseJoinColumns = @JoinColumn(  name = "product_id"))


    private List<Product> productList;


    @ManyToMany
    @JoinTable(name = "order_products",
            joinColumns = @JoinColumn(name = "order_id"))
    private List<Product> products = new ArrayList<>();

}
