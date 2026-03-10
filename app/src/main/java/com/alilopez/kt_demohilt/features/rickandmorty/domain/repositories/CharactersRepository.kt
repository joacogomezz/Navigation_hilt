package com.alilopez.demo.features.rickandmorty.domain.repositories
import com.alilopez.demo.features.rickandmorty.domain.entities.Characters


interface CharactersRepository {
    suspend fun getCharacters(): List<Characters>
}