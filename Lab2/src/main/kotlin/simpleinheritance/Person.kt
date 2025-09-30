package com.sukhee.miu.simpleinheritance

open class Person (
    var name: String
){
    open fun sayHello() = println("Hello, my name is $name")
}