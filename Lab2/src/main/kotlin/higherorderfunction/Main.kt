package com.sukhee.miu.higherorderfunction

fun add(number1: Int, number2: Int) = number1 + number2
fun subtract(number1: Int, number2: Int) = number1 - number2
fun operation(number1: Int, number2: Int, myfun: (Int, Int) -> Int) =
    myfun(
        number1,
        number2
    )

fun main() {
    println(operation(5, 10, myfun = ::add))
    println(operation(5, 10, myfun = ::subtract))
    println(operation(5,100, { number1, number2 -> number1 * number2}))
    println(operation(1000,25){number1, number2 -> number1/number2})
    // above is possible, only because last input parameter is lambda.
}