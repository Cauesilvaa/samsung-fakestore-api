package com.example.samsung_fakestore_api.controller;

import com.example.samsung_fakestore_api.client.CartClient;
import com.example.samsung_fakestore_api.dto.RepositoryGetCartsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartRestController {

    private CartClient cartClient;

    public CartRestController(CartClient cartClient) {
        this.cartClient = cartClient;
    }

    @GetMapping("/get-carts")
    public ResponseEntity<List<RepositoryGetCartsDTO>> getCarts() {
        var response = cartClient.getCarts();
        return ResponseEntity.ok(response);
    }
}
