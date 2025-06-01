package com.example.samsung_fakestore_api.controller;

import com.example.samsung_fakestore_api.client.UserClient;
import com.example.samsung_fakestore_api.dto.RepositoryGetUsersDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private UserClient userClient;
    
    public UserRestController(UserClient userClient){
        this.userClient = userClient;
    }

    @GetMapping("/get-users")
    public ResponseEntity<List<RepositoryGetUsersDTO>> getUsers() {
        var response = userClient.getUsers();
        return ResponseEntity.ok(response);
    }
}
