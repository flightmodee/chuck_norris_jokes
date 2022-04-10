package com.example.project

import kotlinx.serialization.Serializable

@Serializable
data class Joke(val categories: List<String>, val createdAt:String, val iconUrl:String, val id:String, val updatedAt:String, val url:String, val value:String) {
}