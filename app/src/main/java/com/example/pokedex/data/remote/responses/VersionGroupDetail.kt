package com.example.pokedex.data.remote.responses

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.example.pokedex.data.remote.responses.MoveLearnMethod,
    val version_group: com.example.pokedex.data.remote.responses.VersionGroup
)