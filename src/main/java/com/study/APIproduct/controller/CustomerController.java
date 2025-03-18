package com.study.APIproduct.controller;

import com.study.APIproduct.domain.customer.Customer;
import com.study.APIproduct.domain.customer.RequestCustomer;
import com.study.APIproduct.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/login/{email}/{password}")
    public boolean getLogin(@PathVariable String email, @PathVariable String password) {
        return customerService.getCustomerByLogin(email, password);
    }
    @PostMapping("/insert")
    public ResponseEntity<ResponseEntity<Customer>> insertProduct(@RequestBody @Valid RequestCustomer data) {
        return ResponseEntity.ok(customerService.insertCustomer(data));
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseEntity<Customer>> updateProduct(@RequestBody @Valid RequestCustomer data) {
        return ResponseEntity.ok(customerService.updateCustomerAddress(data));
    }
}
