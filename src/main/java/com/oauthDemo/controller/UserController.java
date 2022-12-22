package com.oauthDemo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/app/v1")
public class UserController {

    @GetMapping("/users")
    private String getUsers(){
        String uri = "https://gorest.co.in/public/v2/users";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
    @GetMapping("/comments")
    private String getComments(){
        String uri = "https://gorest.co.in/public/v2/comments";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
    @GetMapping("/posts")
    private String getPosts(){
        String uri = "https://gorest.co.in/public/v2/posts";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }


}
