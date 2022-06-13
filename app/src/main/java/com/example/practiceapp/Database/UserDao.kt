package com.example.practiceapp.Database

import androidx.room.*


@Dao
interface  UserDao {

    @Query("SELECT * FROM User WHERE email = :email ")
    fun getById(email: String) : User

    @Insert
    fun insert(user: User)

    @Query("SELECT * FROM user WHERE email = :email and password = :password")
    fun getByIDAnDPass(email: String, password : String ): User

}