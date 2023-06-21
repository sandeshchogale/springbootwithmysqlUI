package com.springbootmysql.service;


import java.util.List;

import com.springbootmysql.entity.Product;
 
public interface ProductService {
 
    public List<Product> listAll();
     
    public void save(Product product);
     
    public Product get(Integer id);
     
    public void delete(Integer id);
}
