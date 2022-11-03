package com.example.dependencyinjectionhilt

import androidx.transition.Visibility.Mode
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    @Named("sql")
    fun provideSQlUserRepository():UserRepository{
        return FirebaseRepository()
    }

    @Named("firebase")           // As now There are two ways to create object of UserRepository so hilt get confuse so we provide the @Named() and this must be specify in the MainFragment
    fun provideUserRepository():UserRepository{
        return FirebaseRepository()
    }
}