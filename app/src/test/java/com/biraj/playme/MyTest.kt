package com.biraj.playme

import com.biraj.playme.model.User
import com.biraj.playme.repository.UserRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

//This is the test
class MyTest {
    private lateinit var userRepository :UserRepository
    @Test
    fun checkUser() = runBlocking {
        userRepository = UserRepository()
        val response = userRepository.checkUser("biraj", "biraj")
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }
    @Test
    fun registerUser() = runBlocking {
        val user =
            User(FullName = "Biraj", Address = "Kapan",PhoneNo = "123456", Username = "biraj", Password = "biraj")
        userRepository = UserRepository()
        val response = userRepository.registerUser(user)
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }


}