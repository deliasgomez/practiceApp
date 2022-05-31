package com.example.practiceapp

import android.app.Application


class UserApp : Application() {
    val database: UserDataBase by lazy { UserDataBase.getDatabase(this) }

}