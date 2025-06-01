package com.example.samsung_fakestore_api.controller;

import com.example.samsung_fakestore_api.dto.GetProductsDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    @GetMapping("/get-products")
    public List<GetProductsDTO> getProducts() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<GetProductsDTO>> resp = restTemplate.exchange(
                "https://fakestoreapi.com/products",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<GetProductsDTO>>() {}
        );
        return resp.getBody();
    }
}
