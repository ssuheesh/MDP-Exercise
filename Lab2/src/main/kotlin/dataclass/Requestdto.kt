package com.sukhee.miu.dataclass

data class Requestdto (
    val name: String,
            val age: Int
)

fun main() {
    val requestdto= Requestdto("John", 20)
    println(requestdto)
    println(requestdto.name)
    val requestdto1= requestdto.copy(name="Sukhee")
    val requestdto2 = requestdto.copy(name="John")
    println(requestdto2 == requestdto)//uses equals method
    println(requestdto.equals(requestdto2))
    println(requestdto2 === requestdto)//checks references
}