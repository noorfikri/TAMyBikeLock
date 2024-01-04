package com.ubaya.mybikelock.view

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ubaya.mybikelock.R

class LoginActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    lateinit var sharedFile:String
    lateinit var shared: SharedPreferences
    lateinit var editor: SharedPreferences.Editor

    init {
        instance = this
    }

    companion object{
        var instance: LoginActivity?= null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        drawerLayout = findViewById(R.id.loginDrawerLayout)

        navController = (supportFragmentManager.findFragmentById(R.id.loginHostFragment) as NavHostFragment).navController
        NavigationUI.setupActionBarWithNavController(this, navController)


    }
}