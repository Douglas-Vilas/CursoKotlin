package model

import model.Account

class CurrentAccount(
    titular: String,
    number: Int
) : Account(
    titular = titular,
    number = number
) {
    override fun withdraw(value: Double) {
        val valueWithFee = value + 0.1
        if(this.balance >= valueWithFee){
            this.balance -= valueWithFee
        }
    }
}