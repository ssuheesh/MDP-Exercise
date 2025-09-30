package com.sukhee.miu.primconstrwithnotype

class Account(
    accountHolder: String = "", //not property anymore
    accountBalance: Double = 0.0,
    accountNumber: String = ""
) {
    init {
        println("Account initialized with name: $accountHolder, balance: $accountBalance")
    }
    var accountHolder: String = accountHolder
    var accountBalance: Double = accountBalance
    var accountNumber: String = maskAccountNumber(accountNumber = accountNumber)

    fun maskAccountNumber(accountNumber: String) = accountNumber.replace( Regex(".(?=.{4})") , "*")
    override fun toString(): String {
        return "Account(accountHolder='$accountHolder', accountBalance=$accountBalance, accountNumber='$accountNumber')"
    }
}

fun main() {
    val account = Account(accountHolder = "Sukhee", accountBalance = 1000.0, accountNumber = "1234567890")
    println(account)
}