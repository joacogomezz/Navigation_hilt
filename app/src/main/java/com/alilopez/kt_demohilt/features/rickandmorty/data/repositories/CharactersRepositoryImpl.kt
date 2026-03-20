package com.alilopez.demo.features.rickandmorty.data.repositories

import com.alilopez.kt_demohilt.features.rickandmorty.data.datasources.remote.api.RickAndMortyApi
import com.alilopez.demo.features.rickandmorty.data.datasources.remote.mapper.toDomain
import com.alilopez.demo.features.rickandmorty.domain.repositories.CharactersRepository
import com.alilopez.demo.features.rickandmorty.domain.entities.Characters
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val api: RickAndMortyApi
) : CharactersRepository {

    override suspend fun getCharacters(): List<Characters> {
        val response = api.getCharacters()
        return response.results.map { it.toDomain() }
    }
}