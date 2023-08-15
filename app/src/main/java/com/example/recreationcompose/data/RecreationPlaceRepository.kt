package com.example.recreationcompose.data

import com.example.recreationcompose.model.FakeRecreationPlaceDataSource
import com.example.recreationcompose.model.RecreationPlace
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class RecreationPlaceRepository {

    fun getAllRecreationPlaces(): Flow<List<RecreationPlace>> = flowOf(FakeRecreationPlaceDataSource.dummyRecreationPlaces)

    fun getRecreationPlaceById(recreationId: Long) : RecreationPlace {
        return FakeRecreationPlaceDataSource.dummyRecreationPlaces.first {
            it.id == recreationId
        }
    }

    companion object {
        @Volatile
        private var instance: RecreationPlaceRepository? = null

        fun getInstance(): RecreationPlaceRepository =
            instance ?: synchronized(this) {
                RecreationPlaceRepository().apply {
                    instance = this
                }
            }
    }
}