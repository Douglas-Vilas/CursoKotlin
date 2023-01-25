class Account(
    var titular: String,
    val number: Int
) {
    var balance = 0.0
        private set

//    constructor(titular: String, number: Int){
//        this.titular = titular
//        this.number = number
//    }

    fun deposit(value: Double) {
        if (value > 0) {
            this.balance += value
        }
    }

    fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
        }
    }

    fun transfer(value: Double, destiny: Account): Boolean {
        if (balance >= value) {
            balance -= value
            destiny.deposit(value)
            return true
        }
        return false
    }

// Function to return a copy of the balance(private class) information.
//    fun getBalance(): Double {
//        return balance
//    }
//
//    // Function "Set" serves to insert value
//    fun setBalance(value: Double) {
//        if (value > 0){
//            balance = value
//        }
//    }
}