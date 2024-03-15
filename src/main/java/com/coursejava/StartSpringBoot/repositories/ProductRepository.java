package com.coursejava.StartSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.StartSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
