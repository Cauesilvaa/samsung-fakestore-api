package com.example.samsung_fakestore_api.client;

import com.example.samsung_fakestore_api.dto.RepositoryGetCartsDTO;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface CartClient {

    @GetExchange("/carts")
    public List<RepositoryGetCartsDTO> getCarts();
}
