package com.evyatar.belonglife.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.evyatar.belonglife.R
import com.evyatar.belonglife.model.CountriesModelItem
import com.evyatar.belonglife.repository.CountriesRepository
import com.evyatar.belonglife.repository.RoomRepo
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper
import kotlinx.android.synthetic.main.countries_item_layout.view.*
import javax.inject.Inject



class CountriesAdapter(
    private val countriesList: List<CountriesModelItem>,
    private val navController: NavController,
    private val context: Context,
) : RecyclerView.Adapter<CountriesViewHolder>() {

    private val roomRepo = RoomRepo()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CountriesViewHolder(LayoutInflater.from(parent.context), parent)

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        holder.bind(
            countriesList[position].flags[1],
            countriesList[position].name.common,
            navController,
            roomRepo,
            context
        )
    }

    override fun getItemCount() = countriesList.size
}

class CountriesViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.countries_item_layout, parent, false)) {
    private var mCountryFlag: ImageView? = null
    private var mCountryName: TextView? = null

    init {
        mCountryFlag = itemView.flag
        mCountryName = itemView.country_name
    }

    fun bind(
        countryFlag: String,
        countryName: String,
        navController: NavController,
        roomRepo: RoomRepo,
        context: Context,
    ) {
        mCountryName?.text = countryName
        UrlImageViewHelper.setUrlDrawable(mCountryFlag, countryFlag)
        itemView.setOnClickListener {
            roomRepo.addCountryToDB(context, countryName, countryFlag)
            val bundle = bundleOf("flag" to countryFlag)
            navController.navigate(R.id.action_countriesListFragment_to_countryFlagFragment, bundle)
        }
    }
}
