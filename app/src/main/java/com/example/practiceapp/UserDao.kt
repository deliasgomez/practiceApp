package com.example.practiceapp

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface  UserDao {

    @Query("SELECT * FROM User WHERE email = :email ")
    suspend fun getById(email: String) : User

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: User)

}