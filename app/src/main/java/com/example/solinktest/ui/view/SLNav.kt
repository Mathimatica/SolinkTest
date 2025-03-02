package com.example.solinktest.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.solinktest.ui.screen.UserListScreen
import com.example.solinktest.ui.screen.UserScreen
import com.example.solinktest.ui.stateholder.UserStateHolder
import com.example.solinktest.ui.theme.SolinkTheme
import com.example.solinktest.viewmodel.UserListViewModel
import com.example.solinktest.ui.screen.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
object HomeArgs

@Serializable
class UserListScreenArgs(val pageNum:Int, val pagePer:Int)

@Serializable
class UserScreenArgs(val name:String, val imageUrl:String)

@Composable
fun SLNav(){
    SolinkTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = HomeArgs) {
            composable<HomeArgs> {
                HomeScreen()
            }
            composable<UserListScreenArgs> {
                val userViewModel = hiltViewModel<UserListViewModel>()
                userViewModel.photoItemClicked = {
                    navController.navigate(UserScreenArgs(it.photographer, it.src.original))
                }
                val stateHolder = userViewModel.stateHolder.value
                UserListScreen(stateHolder)
            }
            composable<UserScreenArgs> {
                val args = it.toRoute<UserScreenArgs>()
                UserScreen(UserStateHolder(args.name, args.imageUrl)){
                    navController.popBackStack()
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SLNavPreview(){
    SLNav()
}