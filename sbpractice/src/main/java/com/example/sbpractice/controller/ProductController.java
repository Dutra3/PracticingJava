package com.example.sbpractice.controller;

import com.example.sbpractice.model.entities.Product;
import com.example.sbpractice.model.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping()
    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

//    @GetMapping("/page/{pageNumber}") if I use PagingAndSortingRepository
//    public Iterable<Product> getPerPage(@PathVariable int pageNumber) {
//        PageRequest page = PageRequest.of(pageNumber, 3);
//        return productRepository.findAll(page);
//    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable int id) {
        return productRepository.findById(id);
    }

    @PostMapping()
    public Product save(@Valid Product product) {
        productRepository.save(product);

        return product;
    }

    @PutMapping
    public Product update(@Valid Product product) {
        productRepository.save(product);
        return product;
    }

    @DeleteMapping("/{id")
    public void delete(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}
