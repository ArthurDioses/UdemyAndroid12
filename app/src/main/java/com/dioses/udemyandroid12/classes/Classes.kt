package com.dioses.udemyandroid12.classes

fun main() {
    val phone = Phone(123456)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    //---------------Herencias-----
    val smartphone = Smartphone(3456723, true)
    smartphone.call()

    //---------------Sobreescritura-----
    smartphone.showNumber()
    println("es privado? ${smartphone.isPrivate}")

    //------------Data Clasess
    val myUser = User(0, "Arthur", "Dioses", Group.FRIEND.ordinal)
    val bro = myUser.copy(id = 1, name = "Samuel")
    val friend = bro.copy(id = 2,group = Group.FRIEND.ordinal)

    println(myUser.component3())
    println(myUser)
    println(bro)
    println(friend)
}