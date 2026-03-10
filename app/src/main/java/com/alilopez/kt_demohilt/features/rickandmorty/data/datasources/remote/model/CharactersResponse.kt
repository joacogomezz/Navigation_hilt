package com.alilopez.demo.features.rickandmorty.data.datasources.remote.model

data class CharactersResponse(
    val results: List<CharactersDto>
)

data class CharactersDto(
    val id: Int,
    val name: String,
    val status: String,
    val image: String
)