package com.springbootmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootmysql.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
 
}
