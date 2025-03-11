package com.study.APIproduct.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {
    Optional<Product> findByCategory(int id_category);
}
