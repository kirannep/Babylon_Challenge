package com.babylon.babylonchallenge.data.repository

import com.babylon.babylonchallenge.data.model.Post
import com.babylon.babylonchallenge.data.model.comments.Comment
import com.babylon.babylonchallenge.data.model.users.User
import io.reactivex.Single

interface PostRepository {
    fun getPosts(): Single<List<Post>>

    fun getUsers(id: Int): Single<List<User>>

    fun getComments(postId: Int): Single<List<Comment>>
}