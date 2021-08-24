package com.biraj.playme.response

import com.biraj.playme.model.User

data class ProfileResponse(
    val success : Boolean?=null,
    val user : User?=null,
    val token :String?=null
)