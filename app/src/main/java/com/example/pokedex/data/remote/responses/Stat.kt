package com.example.pokedex.data.remote.responses

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: com.example.pokedex.data.remote.responses.StatX
)