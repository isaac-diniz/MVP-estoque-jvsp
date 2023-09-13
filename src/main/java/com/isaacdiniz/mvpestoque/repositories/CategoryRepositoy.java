package com.isaacdiniz.mvpestoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaacdiniz.mvpestoque.entities.Department;

public interface CategoryRepositoy extends JpaRepository<Department, Long>{

	}

