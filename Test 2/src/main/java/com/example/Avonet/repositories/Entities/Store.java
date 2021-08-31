package com.example.Avonet.repositories.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int storeId;
    private String storeLocation;
    private String StoreCapacity;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "stockId",referencedColumnName = "stockId")
    private Stock stock;

}
