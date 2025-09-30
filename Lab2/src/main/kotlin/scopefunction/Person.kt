package com.sukhee.miu.scopefunction

class Person (
    val name: String = "",
    var age: Int= 0,
    var city: String = ""
){
    fun incrementAge() = ++age
    fun moveTo(city: String){
        this.city = city
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, city='$city')"
    }

}

fun main() {
    val alice = Person("Alice", 20, "Amsterdam")
    val info = alice.let {
        it.moveTo("Paris")
        it.incrementAge()
        "Name: ${it.name}, Age: ${it.age}, City: ${it.city}"
        // last line is the result value of info
    }
    println(alice)
    println(info)
}