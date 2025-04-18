package com.example.back.domain.post.repository

import com.example.back.domain.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
}