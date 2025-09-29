package com.sukhee.miu.arraylist

fun main(){
    //create mutable list
    val numbers = mutableListOf(1,2,3,4,5)
    numbers.add(6)
    println(numbers)

    val names: ArrayList<String> = arrayListOf("John", "Sam", "Mary")
    println(names)
    names.add("Mike")
    println(names)
    println(names.first())
    names.clear()
    println(names.firstOrNull())
    println(names.getOrNull(0) ?: "No name")
}