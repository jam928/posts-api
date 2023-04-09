package com.postsapi.controller

import com.postsapi.model.Post
import com.postsapi.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostRestController(val postService: PostService) {

    @PostMapping("/posts")
    fun createPost(@RequestBody post: Post): ResponseEntity<Post> {
        postService.savePost(post)
        return ResponseEntity<Post>(post, HttpStatus.CREATED)
    }

    @GetMapping("/posts")
    fun getAllPosts(): ResponseEntity<List<Post>> {
        return ResponseEntity<List<Post>>(postService.getAllPosts(), HttpStatus.OK)
    }
}