package com.biraj.playme.api

import com.biraj.playme.model.challenge
import com.biraj.playme.response.EstateResponse
import com.biraj.playme.response.ImageResponse
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface EstateAPI {
    @POST("estate/post")
    suspend fun insertEstate(
        @Header("Authorization") token:String,
        @Body challenge: challenge
    ): Response<EstateResponse>

    @GET("p_challenge/show")
    suspend fun getAllEstate(
        @Header("Authorization") token:String
    ): Response<EstateResponse>

    @Multipart
    @PUT("estate/{id}/photo")
    suspend fun uploadImage(
//        @Header("Authorization") token: String,
        @Path("id") id: String,
        @Part file: String,
        body: MultipartBody.Part
    ): Response<ImageResponse>

}



