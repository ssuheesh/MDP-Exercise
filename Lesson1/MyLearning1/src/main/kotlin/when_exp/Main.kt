package com.sukhee.miu.when_exp

fun main(){
    val number = 10
    when(number) {
        10 -> {
            for (i in 1..10) print(i)
            println("Number is 10")
        }
        20 -> println("Number is 20")
        else -> println("Number is neither 10 nor 20")
    }
    val daysOfWeek = 1
    when(daysOfWeek) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
    var test = "test"
    print(test.equals("test"))

    //Another way of using when expression
    when {
        number == 10 -> println("Number is 10")
        number == 20 -> println("Number is 20")
        else -> println("Number is neither 10 nor 20")
    }
    when {
        test.equals("test") -> println("test is equal to test")
        else -> println("test is not equal to test")
    }
}