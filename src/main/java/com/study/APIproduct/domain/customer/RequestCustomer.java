package com.study.APIproduct.domain.customer;

import jakarta.validation.constraints.NotBlank;

public record RequestCustomer (String id, @NotBlank String name, @NotBlank String email, @NotBlank String password, String address){
}
