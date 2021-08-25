package com.biraj.playme.response

import com.biraj.playme.model.challenge

class AddUserResponse (
    val success :Boolean? =null,
    val data : MutableList<challenge>? =null
)