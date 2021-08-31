package com.example.Avonet.repositories.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stockId;
    private int stockCount;
    private LocalDate date;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "itemId",referencedColumnName = "itemId")
    private Item item;

    @OneToMany(mappedBy = "stock")
    @JsonManagedReference
    private List<Store> list=new ArrayList<>();

    public Stock() {
    }

    public Stock(int stockCount, LocalDate date, Item item) {
        this.stockCount = stockCount;
        this.date = date;
        this.item = item;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Store> getList() {
        return list;
    }

    public void setList(ArrayList<Store> list) {
        this.list = list;
    }
}
