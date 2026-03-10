package com.alilopez.demo.features.rickandmorty.data.datasources.remote.mapper

import com.alilopez.demo.features.rickandmorty.data.datasources.remote.model.CharactersDto
import com.alilopez.demo.features.rickandmorty.domain.entities.Characters

fun CharactersDto.toDomain(): Characters {
    return Characters(
        id = this.id,
        name = this.name,
        status = this.status,
        image = this.image
    )
}