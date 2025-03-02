package com.example.solinktest.repository

import com.example.solinktest.network.service.PhotoService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // Available app-wide
object AppModule {

    @Provides
    @Singleton
    fun providePhotoRepository(apiService: PhotoService): PhotoRepository {
        return PhotoRepository(apiService)
    }
}