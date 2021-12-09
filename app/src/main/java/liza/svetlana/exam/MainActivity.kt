package liza.svetlana.exam

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "item"


class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null

            when (item.itemId) {
                R.id.icon_1 -> {
                    fragment = HomeFragment()
                }

                R.id.icon_2 -> {
                    fragment = InfoFragment()
                }

                R.id.icon_3 -> {
                    fragment = AboutFragment()
                }

            }

            replaceFragment(fragment!!)
            true
        }

        bottomNavigationMenu.selectedItemId =
            savedInstanceState?.getInt(
                LAST_SELECTED_ITEM
            ) ?: R.id.icon_1


    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationMenu.selectedItemId)
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }


}