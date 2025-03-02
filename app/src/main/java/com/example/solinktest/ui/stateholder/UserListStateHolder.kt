package com.example.solinktest.ui.stateholder

data class UserListItemStateHolder(val name:String, val imageURL:String = "", val onClick:(()->Unit)? = null)
data class UserListStateHolder(val users:List<UserListItemStateHolder>)