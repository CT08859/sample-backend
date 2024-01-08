package com.citiustech.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/post")
    public ResponseEntity<Object> getAllPost(){
        return new ResponseEntity<>("3:35 Pm from here yyou find all Post", HttpStatus.ACCEPTED);

    }

    @DeleteMapping("post/id")
    public ResponseEntity<Object> deletePostById(@PathVariable("id") String id){
        return new ResponseEntity<>("Deleted Succesfully", HttpStatus.OK);


    }


}
