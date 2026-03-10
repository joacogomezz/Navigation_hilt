package com.alilopez.kt_demohilt.features.rickandmorty.data.datasources.api

import com.alilopez.demo.features.rickandmorty.data.datasources.remote.model.CharactersResponse
import kotlinx.serialization.Serializable
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("character")
    suspend fun getCharacters(): CharactersResponse
}