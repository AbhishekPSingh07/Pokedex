package com.example.pokedex.data.remote.responses

data class Pokemon(
    val abilities: List<com.example.pokedex.data.remote.responses.Ability>,
    val base_experience: Int,
    val forms: List<com.example.pokedex.data.remote.responses.Form>,
    val game_indices: List<com.example.pokedex.data.remote.responses.GameIndice>,
    val height: Int,
    val held_items: List<com.example.pokedex.data.remote.responses.HeldItem>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.example.pokedex.data.remote.responses.Move>,
    val name: String,
    val order: Int,
    val past_abilities: List<Any>,
    val past_types: List<Any>,
    val species: com.example.pokedex.data.remote.responses.Species,
    val sprites: com.example.pokedex.data.remote.responses.Sprites,
    val stats: List<com.example.pokedex.data.remote.responses.Stat>,
    val types: List<com.example.pokedex.data.remote.responses.Type>,
    val weight: Int
)