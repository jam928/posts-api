package com.postsapi.model

import java.io.Serializable
import javax.persistence.*

@Entity
class Post: Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    var id: Long? = null

    @Column(nullable = false)
    var postTitle: String? = null

    @Column(columnDefinition = "TEXT")
    val post: String? = null
}