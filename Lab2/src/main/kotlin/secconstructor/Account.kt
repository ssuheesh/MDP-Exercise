package com.sukhee.miu.secconstructor

class Account(
    var accountHolder: String ,
    var accountBalance: Double ,
    var accountNumber: String
) {
    //Note cannot create another secondary constructor with 3 variables,
    // it will conflict witht he primary constructor

    constructor(accountHolder: String, accountNumber: String) : this(
        accountHolder = accountHolder,
        accountBalance = 0.0,
        accountNumber = accountNumber
    )

    constructor(accountHolder: String): this(accountHolder = accountHolder, accountNumber = "Unknown")
    override fun toString(): String {
        return "Account(accountHolder='$accountHolder', accountBalance=$accountBalance, accountNumber='$accountNumber')"
    }
}

fun main() {
    val account = Account("Sukhee")
    println(account)
    val account1 = Account(
        accountHolder = "Sukhee Secondary",
        accountNumber = "1234567890")
    println(account1)
}