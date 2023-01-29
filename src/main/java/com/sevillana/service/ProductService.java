package com.sevillana.service;

import java.util.Optional;

import com.sevillana.domain.Product;

public interface ProductService {
	
	Iterable<Product> findAll();
	
	Optional<Product> findOne(Integer id);
	
	void save(Product product);
	
	void delete(Integer id);

	Long totalValue();

	long count();

}
