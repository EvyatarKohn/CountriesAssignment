package com.evyatar.belonglife.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.evyatar.belonglife.R
import com.evyatar.belonglife.model.CountriesModelItem
import com.evyatar.belonglife.ui.adapters.CountriesAdapter
import com.evyatar.belonglife.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.countries_list_fragment.*

@AndroidEntryPoint
class CountriesListFragment: Fragment() {

    private val mViewModel: MainViewModel by viewModels()
    private lateinit var mMainListener: MainListener
    private lateinit var mCountriesAdapter: CountriesAdapter

    companion object {
        fun newInstance(mainListener: MainListener) = CountriesListFragment().apply {
            mMainListener = mainListener
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.countries_list_fragment, container, false)

        mViewModel.getAllCountries()

        mViewModel.countriesLiveData.observe(viewLifecycleOwner, { countrise->
            setCountriesAdapter(countrise)
        })

        return v
    }

    private fun setCountriesAdapter(countriesList: List<CountriesModelItem>) {
        val sortedList = countriesList.sortedBy {
            it.name.common
        }
        mCountriesAdapter = CountriesAdapter(sortedList, mMainListener)
        val layoutManager = LinearLayoutManager(activity?.applicationContext)
        countries_recycler_view.layoutManager = layoutManager
        countries_recycler_view.adapter = mCountriesAdapter
    }
}