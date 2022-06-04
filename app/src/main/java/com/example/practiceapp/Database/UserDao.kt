package com.example.practiceapp.Database

import androidx.room.*


@Dao
interface  UserDao {

    @Query("SELECT * FROM User WHERE email = :email ")
    fun getById(email: String) : User

    @Insert
    fun insert(user: User)

}