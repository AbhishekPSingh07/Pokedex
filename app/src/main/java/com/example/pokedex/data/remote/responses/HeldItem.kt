package com.example.pokedex.data.remote.responses

data class HeldItem(
    val item: com.example.pokedex.data.remote.responses.Item,
    val version_details: List<com.example.pokedex.data.remote.responses.VersionDetail>
)