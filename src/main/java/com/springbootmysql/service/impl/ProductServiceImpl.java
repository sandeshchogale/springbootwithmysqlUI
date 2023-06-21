package com.springbootmysql.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmysql.entity.Product;
import com.springbootmysql.repository.ProductRepository;
import com.springbootmysql.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public List<Product> listAll() {
		return repo.findAll();
	}

	@Override
	public void save(Product product) {
		repo.save(product);
	}

	@Override
	public Product get(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	
}
