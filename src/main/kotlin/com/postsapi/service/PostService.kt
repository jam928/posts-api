package com.postsapi.service

import com.postsapi.model.Post
import com.postsapi.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(val postRepository: PostRepository) {

    fun savePost(post: Post) {
        postRepository.save(post)
    }

    fun getAllPosts() = postRepository.findAll();
}