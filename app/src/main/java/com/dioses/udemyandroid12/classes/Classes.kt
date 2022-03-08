package com.dioses.udemyandroid12.classes

fun main() {
    val phone = Phone(123456)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    //---------------Herencias-----
    val smartphone = Smartphone(3456723, true)
    smartphone.call()
    smartphone.showNumber()
    println("es privado? ${smartphone.isPrivate}")
}