package com.example.citas_mvvm.data

import com.example.citas_mvvm.data.model.QuoteModel
import com.example.citas_mvvm.data.model.QuoteProvider
import com.example.citas_mvvm.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}