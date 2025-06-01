package com.example.samsung_fakestore_api.client;

import com.example.samsung_fakestore_api.dto.RepositoryGetUsersDTO;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface UserClient {

    @GetExchange("/users")
    public List<RepositoryGetUsersDTO> getUsers();
}
