package com.biraj.playmewearos

import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface ChallengeAPI {
    @POST("challenges/post")
    suspend fun insertEstate(
        @Header("Authorization") token:String,
        @Body challenges: Challenges
    ): Response<challengeResponse>

    @GET("p_challenge/show")
    suspend fun getAllEstate(
        @Header("Authorization") token:String
    ): Response<challengeResponse>

    @Multipart
    @PUT("estate/{id}/photo")
    suspend fun uploadImage(
//        @Header("Authorization") token: String,
        @Path("id") id: String,
        @Part file: String,
        body: MultipartBody.Part
    ): Response<ImageResponse>

}