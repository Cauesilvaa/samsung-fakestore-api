package com.example.samsung_fakestore_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record RepositoryGetCartsDTO(
        @JsonProperty("id") Integer id,
        @JsonProperty("userId") Integer userId,
        @JsonProperty("date") String date,
        @JsonProperty("products") List<ProductDTO> products,
        @JsonProperty("__v") Integer __v
) {
    public record ProductDTO(
            @JsonProperty("productId") Integer productId,
            @JsonProperty("quantity") Integer quantity
    ) {}
}
