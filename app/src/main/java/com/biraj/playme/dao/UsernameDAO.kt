package com.biraj.playme.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.biraj.playme.Entity.User

@Dao
interface UsernameDAO {
    @Insert
    suspend fun registerUser(user: User)

    @Query("select * from User where Username=(:Username) and Password=(:Password)")
    suspend fun checkUser(Username: String, Password: String): User
}