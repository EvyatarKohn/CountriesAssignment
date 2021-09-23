package com.evyatar.belonglife.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evyatar.belonglife.R
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.country_flag_layout.*

@AndroidEntryPoint
class CountryFlagFragment: Fragment() {

    private lateinit var mFlag: String
    companion object {
        fun newInstance(countryFlag: String) = CountryFlagFragment().apply {
            mFlag = countryFlag
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        UrlImageViewHelper.setUrlDrawable(country_flag, mFlag)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.country_flag_layout, container, false)
    }

}