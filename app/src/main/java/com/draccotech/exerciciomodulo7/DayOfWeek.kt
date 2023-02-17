package com.draccotech.exerciciomodulo7

/*
    Crie um enum DayOfWeek que contém todos os dias da semana
        * Associe cada valor do enum a uma string, que deverá
        conter o dia da semana
        * Ex: MONDAY("monday")
 */
enum class DayOfWeek(val day: String) {
    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday")
}