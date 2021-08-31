package com.example.Avonet.repositories;

import com.example.Avonet.repositories.Entities.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,Integer> {
}
