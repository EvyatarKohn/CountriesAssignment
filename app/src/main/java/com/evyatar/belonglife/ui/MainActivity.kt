package com.evyatar.belonglife.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.evyatar.belonglife.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), MainListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragment(CountriesListFragment.newInstance(this), "COUNTRIES_LIST_FRAGMENT")

    }

    override fun showCountryFlag(countryFlag: String) {
        showFragment(CountryFlagFragment.newInstance(countryFlag), "COUNTRY_FLAG_FRAGMENT")
    }

    private fun showFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment, tag)
            .addToBackStack("tag")
            .commitAllowingStateLoss()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            super.onBackPressed()
        }
    }
}