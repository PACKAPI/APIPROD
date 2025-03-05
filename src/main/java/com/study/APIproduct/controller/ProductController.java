package com.study.APIproduct.controller;

import com.study.APIproduct.domain.product.Product;
import com.study.APIproduct.domain.product.RequestProduct;
import com.study.APIproduct.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get/all")
    public ResponseEntity<List<Product>> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping("/insert")
    public ResponseEntity<Product> insertProduct(@RequestBody @Valid RequestProduct data) {
        return productService.insertProduct(data);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateProduct(@RequestBody @Valid RequestProduct data) {
        return productService.updateProduct(data);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable String id) {
        return productService.deleteProduct(id);
    }
}