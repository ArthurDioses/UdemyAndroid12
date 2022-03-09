package com.dioses.udemyandroid12

fun main() {
    val frutaList = listOf("Manzana", "Banana", "Uva", "Lima")
    println(frutaList.get((0..frutaList.size - 1).random()))
    println("Index de Uva es ${frutaList.indexOf("Uva")}")
}