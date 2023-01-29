package com.sevillana.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevillana.domain.Product;
import com.sevillana.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findOne(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public void save(Product product) {
		productRepository.save(product);
	}

	@Override
	public void delete(Integer id) {
		productRepository.deleteById(id);
	}
	
	@Override
	public Long totalValue() {
		Long total = 0L;
		for (Product product : productRepository.findAll()) {
			total = total + product.getValue(); 
		}
		return total;
	}

	@Override
	public long count() {
		return productRepository.count();
	}

}
