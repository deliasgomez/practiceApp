package com.example.practiceapp

import android.app.Application
import com.example.practiceapp.Database.UserDataBase


class UserApp : Application() {
    val database: UserDataBase by lazy { UserDataBase.getDatabase(this) }

}