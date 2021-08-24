package com.biraj.playme.response

import com.biraj.playme.model.Estate

class AddUserResponse (
    val success :Boolean? =null,
    val data : MutableList<Estate>? =null
)