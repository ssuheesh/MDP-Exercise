package com.sukhee.miu.numbers

fun main(){
    val numbers = arrayOf(1,2,3)
    numbers.forEach { println(it) }
    for( i in numbers) {
        println(i)
    }
    numbers.forEachIndexed { index, i -> println("Element at $index is $i")}
    for( i in 1..10) print( "$i ")
    println()
    for(i in 1..10 step 2) print("$i ")
    println()
    for(i in 10 downTo 1) print("$i ")
    println()
    for(i in 9 downTo 0 step 3) print("$i ")
    println()

}