package com.example.practiceapp


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class RegistroViewModel(private val userDao: UserDao) : ViewModel() {
    fun registrar(user: User) {
        viewModelScope.launch {
            userDao.insert(user)
        }
    }

}
class RegistroViewModelFactory(private val itemDao: UserDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegistroViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RegistroViewModel(itemDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }



}
