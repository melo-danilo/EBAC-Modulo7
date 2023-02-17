package com.draccotech.exerciciomodulo7

fun main(){

    /*
        Crie uma função de extensão para o tipo primitivo String,
        que transforma a string em uma lista de strings, composta
        por todas as letras da mesma.
     */
    fun String.toLetterList(): List<String> {
        return this.split("").filter { it.isNotBlank() }
    }

    /*
        Crie uma string e utilizando a extensão criada imprima todas
        as letras da string
        * obs: Essa palavra se refere a uma doença pulmonar causada
        pela inalação de poeira vulcânica fina
     */
    val string = "pneumoultramicroscopicossilicovulcanoconiótico"
    val listString: List<String> = string.toLetterList()

    listString.forEach{
        println(it)
    }


    /*
        Pegue uma instância do singleton que criamos anteriormente
     */
    UtilityHelper

    /*
        Use o método setCurrentDay e altere o dia  da semana para
        segunda-feira
     */
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)

    /*
        Chame o método isWeekend e confira se ele está retornando
        falso
     */
    println(UtilityHelper.isWeekend())

    /*
        Pegue uma nova instância do singleton, e usando setCurrentDay
        altere o dia atual para domingo
     */
    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)

    /*
        Chame o método isWeekend e confira se agora ele está retornando
        verdadeiro
     */
    println(UtilityHelper.isWeekend())

}