package com.sukhee.miu.lambda_exp

fun main(){
    val subtractNumbers = {num1: Int, num2: Int -> num1 - num2}
    println(subtractNumbers(10, 5))
}