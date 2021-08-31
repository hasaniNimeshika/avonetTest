package com.example.Avonet.repositories;

import com.example.Avonet.repositories.Entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Integer> {
}
