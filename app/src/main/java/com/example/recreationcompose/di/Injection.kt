package com.example.recreationcompose.di

import com.example.recreationcompose.data.RecreationPlaceRepository

object Injection {
    fun provideRepository(): RecreationPlaceRepository {
        return RecreationPlaceRepository.getInstance()
    }
}