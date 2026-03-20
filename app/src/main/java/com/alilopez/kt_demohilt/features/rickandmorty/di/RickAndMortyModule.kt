package com.alilopez.kt_demohilt.features.rickandmorty.di

import com.alilopez.demo.features.rickandmorty.data.repositories.CharactersRepositoryImpl
import com.alilopez.demo.features.rickandmorty.domain.repositories.CharactersRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RickAndMortyModule {

    @Binds
    @Singleton
    abstract fun bindCharactersRepository(
        charactersRepositoryImpl: CharactersRepositoryImpl
    ): CharactersRepository
}