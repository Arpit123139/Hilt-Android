package com.example.dependencyinjectionhilt

import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

const val TAG="Arpit"

// This is a Constructor Injection from LoggerService
//@AndroidEntryPoint
//class UserRepository @Inject constructor( val loggerService: LoggerService) {        //The Annotation @InjectConstructor Represent that we have to inject this class in some other class
//
//    fun saveUser(email:String,password:String){
//        loggerService.log("User Saved In DB")
//        Log.d(TAG,"user saved in DB")
//    }
//}

// Now here we create a Interface and this interface is injected in UserApplication so we must need a module in order to define implementation
interface UserRepository{
    fun saveUser(email:String,password:String)
}

class SQLRepository @Inject constructor():UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"user saved in DB")
    }
}

class FirebaseRepository @Inject constructor():UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"user saved in Firebase")
    }
}