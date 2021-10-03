package com.example.ktorclientsample.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class PostRequest(
    val title: String,
    val body: String,
    val userId: Int
)
