package com.example.citas_mvvm.domain

import com.example.citas_mvvm.data.QuoteRepository
import com.example.citas_mvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()
}