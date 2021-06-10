package com.example.citas_mvvm.model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel{
            val position = (0..4).random()
            return quote[position]
        }
        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Nunca confíes en un ordenador que no puedas lanzar por una ventana",
                author = "Steve Wozniak"
            ),
            QuoteModel(
                quote = "Hardware: las partes de un ordenador que pueden ser pateadas",
                author = "Jeff Pesis"
            ),
            QuoteModel(
                quote = "La mayoría del software actual es muy parecido a una pirámide egipcia, con millones de ladrillos puestos unos encima de otros sin una estructura integral, simplemente realizada a base de fuerza bruta y miles de esclavos",
                author = "Alan Kay"
            ),
            QuoteModel(
                quote = "Hay dos grandes productos que salieron de Berkeley: LSD y UNIX. No creemos que esto sea una coincidencia",
                author = "Jeremy S. Anderson"
            ),
            QuoteModel(
                quote = "Se dice que las grandes disciplinas científicas son ejemplos de gigantes subidos a los hombros de otros gigantes. También se dice que la industria del software es un ejemplo de enanos subidos a los dedos de los pies de otros enanos",
                author = "Alan Cooper"
            ),
        )
    }
}