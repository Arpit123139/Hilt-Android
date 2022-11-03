package com.example.dependencyinjectionhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

//This is a field Injection
@HiltAndroidApp          // This Annonation is for Application Class
class UserApplication :Application(){

    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

        //The property with @Inject get Initialize
        userRepository.saveUser("test@gmail.com","11111")
    }

}