package com.example.citas_mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.citas_mvvm.model.QuoteModel
import com.example.citas_mvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote =  QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}