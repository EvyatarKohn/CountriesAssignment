package com.evyatar.belonglife.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evyatar.belonglife.R
import com.evyatar.belonglife.repository.CountriesRepository
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.country_flag_layout.*
import javax.inject.Inject

@AndroidEntryPoint
class CountryFlagFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        UrlImageViewHelper.setUrlDrawable(country_flag, arguments?.getString("flag").toString())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.country_flag_layout, container, false)
    }

}