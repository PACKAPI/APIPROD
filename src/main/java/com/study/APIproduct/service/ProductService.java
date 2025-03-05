package com.study.APIproduct.service;

import com.study.APIproduct.domain.product.Product;
import com.study.APIproduct.domain.product.ProductRepository;
import com.study.APIproduct.domain.product.RequestProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    public ResponseEntity<Product> getProductById(String id) {
        Optional<Product> optionalProduct = repository.findById(id);
        if (optionalProduct.isPresent()){
            return ResponseEntity.ok(optionalProduct.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Product> insertProduct(RequestProduct data) {
        Product product = new Product(data);
        repository.save(product);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Product> updateProduct(RequestProduct data) {
        Optional<Product> optionalProduct = repository.findById(data.id());
        if (optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            product.setName(data.name());
            product.setPrice_in_cents(data.price_in_cents());
            repository.save(product);
            return ResponseEntity.ok(product);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Product> deleteProduct(String id) {
        Optional<Product> optionalProduct = repository.findById(id);
        if (optionalProduct.isPresent()){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
