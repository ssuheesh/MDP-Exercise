package com.sukhee.miu.simpleclass

class Account {
    var accountHolder: String = ""
    var accountBalance: Double = 0.0
    var accountNumber: String = ""


    override fun toString(): String {
        return "Account(accountHolder='$accountHolder', accountBalance=$accountBalance, accountNumber='$accountNumber')"
    }
}

fun main() {
    val account = Account()
    account.accountHolder = "Sukhee"
    account.accountBalance = 1000.0
    account.accountNumber = "1234567890"
    println(account)
}