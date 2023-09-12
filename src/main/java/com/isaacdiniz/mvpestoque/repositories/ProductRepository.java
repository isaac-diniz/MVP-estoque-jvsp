package com.isaacdiniz.mvpestoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaacdiniz.mvpestoque.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
