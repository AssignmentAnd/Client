package com.biraj.playmewearos

import okhttp3.MultipartBody

class  postRepo: MyApiRequest() {
    private val challengeAPI= ServiceBuilder.buildService(ChallengeAPI::class.java)
    suspend fun insertArtist(challenges: Challenges): challengeResponse {
        return apiRequest {
            challengeAPI.insertEstate(ServiceBuilder.token!!, challenges)
        }
    }

    suspend fun getAllArtist(): challengeResponse {
        return apiRequest {
            challengeAPI.getAllEstate(ServiceBuilder.token!!)
        }
    }

    //    @DELETE("student/{id")
//    suspend fun deleteS
//
    suspend fun  uploadImage(id: String, body: MultipartBody.Part): ImageResponse {
        return apiRequest {
            challengeAPI.uploadImage(ServiceBuilder.token!!,id,body)
        }
    }
}