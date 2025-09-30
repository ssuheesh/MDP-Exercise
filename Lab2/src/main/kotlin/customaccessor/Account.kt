package com.sukhee.miu.customaccessor

class Account {
    var accountHolder: String = ""
        get() {
            //validate account number
            return field
        }
        set(value) {
            field = value + "ACC"
        }
    var accountBalance: Double = 0.0
//        private set
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