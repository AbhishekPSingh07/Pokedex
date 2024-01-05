package com.example.pokedex.data.remote.responses

data class Move(
    val move: com.example.pokedex.data.remote.responses.MoveX,
    val version_group_details: List<com.example.pokedex.data.remote.responses.VersionGroupDetail>
)