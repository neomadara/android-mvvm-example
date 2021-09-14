package com.example.citas_mvvm.domain

import com.example.citas_mvvm.data.model.QuoteModel
import com.example.citas_mvvm.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val quoteProvider: QuoteProvider) {
    operator fun invoke():QuoteModel?{
        val quotes = quoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}