package com.biraj.playme.repository

import com.biraj.playme.model.User
import com.biraj.playme.api.MyApiRequest
import com.biraj.playme.api.ServiceBuilder
import com.biraj.playme.api.UserAPI
import com.biraj.playme.response.Loginresponse
import com.biraj.playme.response.ProfileResponse

class UserRepository: MyApiRequest() {
    //Create retrofit instance of USERAPI
    private val userAPI = ServiceBuilder.buildService(UserAPI::class.java)

    //register user
    suspend fun registerUser(user: User): Loginresponse {
        return apiRequest {
            userAPI.registerUser(user)
        }
    }
    //login uer
    suspend fun checkUser(Username:String,Password:String):Loginresponse{
        return apiRequest {
            userAPI.checkUser(Username,Password)
        }
    }

    suspend fun updateProfile(token:String,id:String,Fullname:String,Address:String,PhoneNo:String,Username:String,Password:String):ProfileResponse{
        return apiRequest {
            userAPI.updateProfile(token,id,Fullname,Address,PhoneNo,Username,Password)
        }
    }
    suspend fun getProfile(token:String):ProfileResponse{
        return apiRequest {
            userAPI.getUserProfile(token)
        }
    }
}