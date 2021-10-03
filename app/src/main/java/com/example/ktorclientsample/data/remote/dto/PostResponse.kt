package com.example.ktorclientsample.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class PostResponse(
    val id: Int,
    val title: String,
    val body: String,
    val userId: Int
)
