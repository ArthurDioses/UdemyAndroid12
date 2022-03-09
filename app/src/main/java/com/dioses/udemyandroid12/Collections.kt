package com.dioses.udemyandroid12

import com.dioses.udemyandroid12.classes.Group
import com.dioses.udemyandroid12.classes.User

fun main() {
    val frutaList = listOf("Manzana", "Banana", "Uva", "Lima")
    println(frutaList.get((0..frutaList.size - 1).random()))
    println("Index de Uva es ${frutaList.indexOf("Uva")}")

    //------------Mutable List
    val myUser = User(0, "Arthur", "Dioses", Group.FRIEND.ordinal)
    val bro = myUser.copy(id = 1, name = "Samuel")
    val friend = bro.copy(id = 2, group = Group.FRIEND.ordinal)

    val usersList = mutableListOf(myUser, bro)
    println(usersList)
    usersList.add(friend)
    println(usersList)
    //usersList.removeAt(1)
    usersList.remove(bro)
    println(usersList)

    val userSelectedList = mutableListOf<User>()
    println(userSelectedList)
    //userSelectedList.addAll(usersList)
    userSelectedList.add(myUser)
    println(userSelectedList)
    userSelectedList.set(0, bro)
    println(userSelectedList)
    userSelectedList.add(myUser)
    userSelectedList.add(myUser)
    println(userSelectedList)

    //------------Map
    val userMap = mutableMapOf<Int, User>()
    println(userMap)
    userMap.put(myUser.id.toInt(), myUser)
    userMap.put(myUser.id.toInt(), myUser)
    println(userMap)
    userMap.put(friend.id.toInt(), friend)
    println(userMap)
    userMap.remove(2)
    println(userMap)
    println(userMap.isEmpty())
    println(userMap.containsKey(0))
    userMap.put(bro.id.toInt(), bro)
    println(userMap)
    userMap.put(friend.id.toInt(), friend)
    println(userMap)
    println(userMap.keys)
    println(userMap.values)


}