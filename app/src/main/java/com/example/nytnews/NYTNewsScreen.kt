package com.example.nytnews

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.nytnews.ui.ArticleScreen
import com.example.nytnews.ui.BookScreen

enum class NYTNewsScreen(@DrawableRes val icon: Int, val destName: String) {
    ArticleScreen(R.drawable.baseline_article_24, "Articles"),
    BookScreen(R.drawable.baseline_book_24, "Books")
}

@Composable
fun NYTNewsApp(
    navController: NavHostController = rememberNavController()
) {
    val bottomNavItem = listOf(NYTNewsScreen.ArticleScreen, NYTNewsScreen.BookScreen)

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                bottomNavItem.forEach {item ->
                    NavigationBarItem(
                        icon = { Icon(painter = painterResource(id = item.icon), contentDescription = item.destName)},
                        label = { Text(text = item.destName)},
                        selected = currentDestination?.hierarchy?.any { it.route == item.name } == true,
                        onClick = {
                            navController.navigate(item.name) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = NYTNewsScreen.ArticleScreen.name, Modifier.padding(innerPadding)) {
            composable(NYTNewsScreen.ArticleScreen.name) {
                ArticleScreen(modifier = Modifier.fillMaxSize())
            }
            composable(NYTNewsScreen.BookScreen.name) {
                BookScreen(modifier = Modifier.fillMaxSize())
            }
        }

    }
}