package com.biraj.playme.repository

import com.biraj.playme.api.EstateAPI
import com.biraj.playme.api.MyApiRequest
import com.biraj.playme.api.ServiceBuilder
import com.biraj.playme.model.Estate
import com.biraj.playme.response.EstateResponse
import com.biraj.playme.response.ImageResponse
import okhttp3.MultipartBody

class  ArtistRepository: MyApiRequest() {
    private val ArtistAPI= ServiceBuilder.buildService(EstateAPI::class.java)
    suspend fun insertArtist(estate: Estate):EstateResponse{
        return apiRequest {
            ArtistAPI.insertEstate(ServiceBuilder.token!!, estate)
        }
    }

    suspend fun getAllArtist(): EstateResponse {
        return apiRequest {
            ArtistAPI.getAllEstate(ServiceBuilder.token!!)
        }
    }

    //    @DELETE("student/{id")
//    suspend fun deleteS
//
    suspend fun  uploadImage(id: String, body: MultipartBody.Part): ImageResponse {
        return apiRequest {
            ArtistAPI.uploadImage(ServiceBuilder.token!!,id,body)
        }
    }
}


