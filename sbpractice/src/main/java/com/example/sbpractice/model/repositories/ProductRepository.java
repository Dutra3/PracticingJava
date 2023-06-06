package com.example.sbpractice.model.repositories;

import com.example.sbpractice.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
