package com.coursejava.StartSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.StartSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
