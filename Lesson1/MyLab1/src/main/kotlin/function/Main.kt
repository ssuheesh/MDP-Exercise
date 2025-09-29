package com.sukhee.miu.function

fun main() {
    println(findGCD(12,15))
    println(add(b=3))
    println(addNumbers(1,2,3,4,5))

    fun getMax(a: Int, b: Int): Int =
        if (a > b) a else b

    fun getMin(a: Int, b: Int): Int {
        return if (a < b) a else b
    }

    var greeting = "Hello"
    fun buildMessage(): String {
        return "$greeting Kotlin!"
    }

    fun displayMessage(message: String) {
        println(message)
    }

    println(buildMessage())
    println(displayMessage("asdasd"))

    val myprint = ::displayMessage //function can be referred by a variable, :: is a function reference operator
    myprint("hello")
}

fun add(a: Int=2, b: Int): Int = a + b

fun addNumbers(vararg numbers: Int): Int =
    numbers.sum()

fun findGCD(a: Int, b: Int): Int =
    if (b == 0) a
    else findGCD(b, a % b)