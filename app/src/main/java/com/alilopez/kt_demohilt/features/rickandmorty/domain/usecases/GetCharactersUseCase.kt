package com.alilopez.demo.features.rickandmorty.domain.usecases

import com.alilopez.demo.features.rickandmorty.domain.repositories.CharactersRepository
import com.alilopez.demo.features.rickandmorty.domain.entities.Characters
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharactersRepository
) {

    suspend operator fun invoke(): Result<List<Characters>> {
        return try {
            val characters = repository.getCharacters()

            val filteredCharacters = characters.filter { it.name.isNotBlank() }

            if (filteredCharacters.isEmpty()) {
                Result.failure(Exception("No se encontraron personajes válidos"))
            } else {
                Result.success(filteredCharacters)
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}