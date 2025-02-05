package com.study.APIproduct.domain.product;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "product")
@Entity
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private int price_in_cents;
    public Product(){

    }
    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice_in_cents(int price_in_cents) {
        this.price_in_cents = price_in_cents;
    }

    public int getPrice_in_cents() {
        return price_in_cents;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
