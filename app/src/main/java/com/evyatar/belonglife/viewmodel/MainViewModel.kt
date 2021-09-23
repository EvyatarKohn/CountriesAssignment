package com.evyatar.belonglife.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evyatar.belonglife.model.CountriesModel
import com.evyatar.belonglife.repository.CountriesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: CountriesRepository) : ViewModel() {

    private var mCountriesMutableLiveData = MutableLiveData<CountriesModel>()
    val countriesLiveData: LiveData<CountriesModel>
        get() = mCountriesMutableLiveData

    private var mRequestFailureMutableLiveData = MutableLiveData<Boolean>()
    val requestFailureLiveData: LiveData<Boolean>
        get() = mRequestFailureMutableLiveData

    fun getAllCountries() = viewModelScope.launch {
        repository.getAllCountries().let { response ->
            if (response.isSuccessful) {
                mCountriesMutableLiveData.postValue(response.body())
            } else {
                mRequestFailureMutableLiveData.postValue(true)
            }
        }
    }

}