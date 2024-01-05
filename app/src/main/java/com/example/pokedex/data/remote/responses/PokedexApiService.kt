package com.example.pokedex.data.remote.responses
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

private const val BASE_URL=" https://pokeapi.co/api/v2/";
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(com.example.pokedex.data.remote.responses.BASE_URL)
    .build()

