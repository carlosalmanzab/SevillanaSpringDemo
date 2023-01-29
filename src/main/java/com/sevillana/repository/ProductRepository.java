package com.sevillana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sevillana.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
