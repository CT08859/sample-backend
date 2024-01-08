package com.citiustech.blog.controller;

import com.citiustech.blog.model.BlogDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @PostMapping("/post")
    public ResponseEntity<Object> addPost(@RequestBody BlogDto blogDto){
        return new ResponseEntity<>("Post Added Successfully", HttpStatus.CREATED);
    }


    @GetMapping("/post")
    public ResponseEntity<Object> getAllPost(){
        return new ResponseEntity<>("3:35 Pm started, 4:10Pm edit started agan 4:30PM", HttpStatus.ACCEPTED);
    }

    @PutMapping("/post/{id}")
    public ResponseEntity<Object> updatePostById(@PathVariable Integer id){
        return new ResponseEntity<>("Post updated successfully", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/post/{id}")
    public ResponseEntity<Object> deletePostById(@PathVariable Integer id){
        return new ResponseEntity<>("Deleted Successfully Now", HttpStatus.OK);
    }

//    todo added some item that need to be captured will see how its going to be work for me
//    started on 5:15PM
    //  hj hjh sdfdf vgfbg bgbgh njnhj wewre fggfgb
//    asddsfdf vgfbgf hgnh qweewreretrtr
    // nknknk dfd vfdvd
    // vfgbgf bgfbfg bgfbf rgert qeqweweefv  bgbhggh  bghbghh
//    asdfghjkl lkjhgfdsa
  

}
