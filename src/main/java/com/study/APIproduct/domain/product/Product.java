package com.study.APIproduct.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Table(name = "product")
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private int price_in_cents;
    private String description;
    private String image_url;
    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        this.description = requestProduct.description();
        this.image_url = requestProduct.image_url();
    }
}