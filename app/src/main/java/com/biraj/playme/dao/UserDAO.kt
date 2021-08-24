package com.biraj.playme.dao

import androidx.room.*
import com.biraj.playme.Entity.User

@Dao

interface UserDAO {
    @Insert
    suspend fun insertStudent(student : User)

    @Query("SELECT * FROM User")
    suspend fun getAllStudents() : List<User>

    @Update
    suspend fun updateStudent(student : User)

    @Delete
    suspend fun DeleteStudent(student : User)
}