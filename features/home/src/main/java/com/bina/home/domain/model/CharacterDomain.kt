package com.bina.home.domain.model

data class CharacterDomain(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: OriginDomain?,
    val location: LocationDomain?,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)

data class OriginDomain(
    val name: String,
    val url: String
)

data class LocationDomain(
    val name: String,
    val url: String
)