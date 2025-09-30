package com.sukhee.miu.function_exp_cont

fun main() {
    val square3 = {x: Int -> x * x}
    val square2: (Int) -> Int = {x -> x * x}
    val square: (Int) -> Int = {
        it * it
    }
    val factorial: (Int) -> Int = {
        var result = 1
        for (i in 1..it) {
            result *= i
        }
        result
    }
    println(square3(5))
    println(square2(5))
    println(square(5))
    println(factorial(5))
}

