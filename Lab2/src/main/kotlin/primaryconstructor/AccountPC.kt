package com.sukhee.miu.primaryconstructor

class AccountPC(
    private var accountHolder: String = "",
    private var accountBalance: Double = 0.0,
    val accountNumber: String = ""
) {
    override fun toString(): String {
        return "AccountPC(accountHolder='$accountHolder', accountBalance=$accountBalance, accountNumber='$accountNumber')"
    }
}

fun main(){
    val accountPC = AccountPC(accountBalance = 1000.0, accountHolder = "Sukhee", accountNumber =  "1234567890")
    println(accountPC)
}