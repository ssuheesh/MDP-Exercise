package com.sukhee.miu.enumclass

enum class Coffee {
    AMERICANO, ESPRESSO, LATTE, CAPPUCCINO
}

fun main() {
    val coffee: Coffee = Coffee.CAPPUCCINO
    println(coffee)
    println(Coffee.values().joinToString { it.name })
//    println(Coffee.valueOf(readlnOrNull() ?: "LATTE"))
    when(coffee) {
        Coffee.AMERICANO -> println("Americano")
        Coffee.ESPRESSO -> println("Espresso")
        Coffee.LATTE -> println("Latte")
        Coffee.CAPPUCCINO -> println("Cappuccino")
    }

}