package com.example.solinktest.ui.stateholder

sealed class StateHolder<out T> {
    data object Loading : StateHolder<Nothing>()
    data class Success<T>(val data: T) : StateHolder<T>()
    data class Error(val message: String?) : StateHolder<Nothing>()
}