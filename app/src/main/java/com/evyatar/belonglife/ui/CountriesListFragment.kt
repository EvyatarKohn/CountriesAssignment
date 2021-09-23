package com.evyatar.belonglife.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.evyatar.belonglife.R
import com.evyatar.belonglife.model.CountriesModelItem
import com.evyatar.belonglife.ui.adapters.CountriesAdapter
import com.evyatar.belonglife.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.countries_list_fragment.*

@AndroidEntryPoint
class CountriesListFragment : Fragment() {

    private val mViewModel: MainViewModel by viewModels()
    private lateinit var mCountriesAdapter: CountriesAdapter
    private lateinit var mNavController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.countries_list_fragment, container, false)
        val navHostFragment =
            activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        mNavController = navHostFragment.navController

        mViewModel.getAllCountries()
        mViewModel.countriesLiveData.observe(viewLifecycleOwner, { countrise ->
            loader_lottie.visibility = View.GONE
            setCountriesAdapter(countrise, mNavController)
        })

        return v
    }

    private fun setCountriesAdapter(
        countriesList: List<CountriesModelItem>,
        mNavController: NavController
    ) {
        val sortedList = countriesList.sortedBy {
            it.name.common
        }
        mCountriesAdapter = CountriesAdapter(sortedList, mNavController)
        val layoutManager = LinearLayoutManager(activity?.applicationContext)
        countries_recycler_view.layoutManager = layoutManager
        countries_recycler_view.adapter = mCountriesAdapter
    }
}