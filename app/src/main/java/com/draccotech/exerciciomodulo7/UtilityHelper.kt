package com.draccotech.exerciciomodulo7

/*
    Crie um singleton chamado UtilityHelper
    * Crie uma propriedade privada do tipo
    do enum criado na atividade anterior chamada currentDay
    * Inicialize o valor de currentDay com SUNDAY
    * Crie um método setCurrentDay, que altera o valor da
    propriedade currentDay
    * Crie um método isWeekend que retorna verdadeiro quando
    o valor de currentDay é sábado ou domingo
 */
object UtilityHelper {
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(day: DayOfWeek){
        this.currentDay = day
    }

    fun isWeekend(): Boolean{
        return when(currentDay){
            DayOfWeek.SUNDAY -> true
            DayOfWeek.SATURDAY -> true
            else -> false

        }
    }
}