package com.example.pokedex.di

import com.example.pokedex.data.remote.PokedexApiService
import com.example.pokedex.repository.PokemonRepository
import com.example.pokedex.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        api : PokedexApiService
    ) = PokemonRepository(api)

    fun providePokeApi() : PokedexApiService{
        return Retrofit.Builder()
            .addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokedexApiService::class.java)

    }
}