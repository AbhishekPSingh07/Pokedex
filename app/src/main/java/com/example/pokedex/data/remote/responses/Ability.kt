package com.example.pokedex.data.remote.responses

data class Ability(
    val ability: com.example.pokedex.data.remote.responses.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)