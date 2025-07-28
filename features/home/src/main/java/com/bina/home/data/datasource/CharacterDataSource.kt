package com.bina.home.data.datasource

import com.bina.home.data.model.CharacterData

interface CharacterDataSource {
    suspend fun getCharacters(query: String, page: Int): List<CharacterData>
}
