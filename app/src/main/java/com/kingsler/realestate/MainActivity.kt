package com.kingsler.realestate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kingsler.realestate.databinding.ActivityMainBinding
import com.kingsler.realestate.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set toolbar title
        binding.toolbarTitleTv.text = "Home"

        // Handle bottom navigation
        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item_home -> {
                    binding.toolbarTitleTv.text = "Home"
                    // TODO: Switch to HomeFragment
                }
                R.id.item_chats -> {
                    binding.toolbarTitleTv.text = "Chats"
                    // TODO: Switch to ChatsFragment
                }
                R.id.item_favorite -> {
                    binding.toolbarTitleTv.text = "Favorites"
                    // TODO: Switch to FavoritesFragment
                }
                R.id.item_profile -> {
                    binding.toolbarTitleTv.text = "Profile"
                    // TODO: Switch to ProfileFragment
                }
            }
            true
        }
    }
    private fun showHomeFragment(){

        binding.toolbarTitleTv.text = "Home"

        val homeFragment = HomeFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentsfl.id, homeFragment,"Home")
        fragmentTransaction.commit()
    }
}


