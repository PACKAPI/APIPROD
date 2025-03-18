package com.study.APIproduct.service;

import com.study.APIproduct.domain.customer.Customer;
import com.study.APIproduct.domain.customer.CustomerRepository;
import com.study.APIproduct.domain.customer.RequestCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class CustomerService {
    @Autowired
    private CustomerRepository repository;
    public ResponseEntity<Customer> insertCustomer(RequestCustomer data) {
        Customer customer = new Customer(data);
        repository.save(customer);
        return ResponseEntity.ok().build();
    }
    public ResponseEntity<Customer> updateCustomerAddress(RequestCustomer data) {
        Optional<Customer> optionalCustomer = repository.findById(data.id());
        if (optionalCustomer.isPresent()){
            Customer customer = optionalCustomer.get();
            customer.setAddress(data.address());
            repository.save(customer);
            return ResponseEntity.ok(customer);
        }
        return ResponseEntity.notFound().build();
    }
    public boolean getCustomerByLogin(String email, String password) {
        Optional<Customer> optionalCustomer = repository.findByEmailAndPassword(email, password);
        if (optionalCustomer.isPresent()){
            return true;
        }
        return false;
    }
}
