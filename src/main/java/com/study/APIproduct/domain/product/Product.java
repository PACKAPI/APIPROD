package com.study.APIproduct.domain.product;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "product")
@Entity
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private int price_in_cents;
    private String description;
    private String url_image;
    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        this.description = requestProduct.description();
        this.url_image = requestProduct.image_url();
    }
    public Product() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice_in_cents() {
        return price_in_cents;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice_in_cents(int price_in_cents) {
        this.price_in_cents = price_in_cents;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl_image(String image_url) {
        this.url_image = image_url;
    }
}