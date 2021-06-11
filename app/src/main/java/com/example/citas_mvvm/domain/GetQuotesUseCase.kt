package com.example.citas_mvvm.domain

import com.example.citas_mvvm.data.QuoteRepository
import com.example.citas_mvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()
}