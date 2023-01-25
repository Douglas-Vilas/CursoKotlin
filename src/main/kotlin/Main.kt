fun main() {
    // Design of a digital Bank
    println("Welcome to Bytebank!")
    val accountDouglas = Account(titular = "Douglas", number = 1000)
    accountDouglas.deposit(200.0)

    val accountAngelica = Account(titular = "Angélica", number = 1001)
    accountAngelica.deposit(300.0)

    println(accountAngelica.titular)
    println(accountAngelica.number)
    println(accountAngelica.balance)
    println("")

    println(accountDouglas.titular)
    println(accountDouglas.number)
    println(accountDouglas.balance)
    println("")

    println("Depositing in the account of Douglas")
    accountDouglas.deposit(value = 50.0)
    println(accountDouglas.balance)
    println("")

    println("Depositing in the account of Angélica")
    accountAngelica.deposit(value = 70.0)
    println(accountAngelica.balance)
    println("")

    println("Withdrawing from Douglas's account")
    accountDouglas.withdraw(value = 250.0)
    println(accountDouglas.balance)
    println("")

    println("Withdrawing from Angelica's account")
    accountAngelica.withdraw(value = 100.0)
    println(accountAngelica.balance)
    println("")

    println("Overdraft on Douglas account")
    accountDouglas.withdraw(value = 100.0)
    println(accountDouglas.balance)
    println("")

    println("Overdraft on Angélica account")
    accountAngelica.withdraw(value = 500.0)
    println(accountAngelica.balance)
    println("")

    println("Transfer of Angélica's account to Douglas")
    if (accountAngelica.transfer(value = 100.0, accountDouglas)) {
        println("Successful transfer")
    } else {
        println("Transfer failure")
    }
    println("")

    println("Douglas account: ${accountDouglas.balance}")
    println("Angélica account: ${accountAngelica.balance}")
    println("")
}

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

fun testCopiesAndReferences() {
    val numberX = 10
    var numberY = numberX
    numberY++

    println("NumberX $numberX")
    println("NumberY $numberY")

    val accountMaicon = Account("Maicon", 1002)
    accountMaicon.titular = "Maicon"
    var accountMae = Account("Mother", 1003)
    accountMae.titular = "Mother"
    accountMaicon.titular = "Maicon"

    println("Maicon account holder: ${accountMaicon.titular}")
    println("Mother account holder: ${accountMae.titular}")

}

fun testLoops() {
    var i = 0
    while (i < 5) {

        // Account Details
        val titular = "Douglas $i" // val = Cannot be changed(reassigned). var = Can be changed.
        val accountNumber = 1000 + i
        var balance = i + 10.0  // Variable that can change its initial value.

        println("Titular: $titular") // In Kotlin, we can use the "$" to use the variable inside the string field.
        println("Account Number: $accountNumber")
        println("Account Balance: $balance")
        println()
        i++
    }
    for (i in 5 downTo 1) {

        // Account Details
        val titular = "Douglas $i" // val = Cannot be changed(reassigned). var = Can be changed.
        val accountNumber = 1000 + i
        var balance = i + 10.0  // Variable that can change its initial value.

        println("Titular: $titular") // In Kotlin, we can use the "$" to use the variable inside the string field.
        println("Account Number: $accountNumber")
        println("Account Balance: $balance")
        println()
    }
}

fun testConditions(balance: Double) {
    if (balance > 0.0) {
        println("Account is positive.")
    } else if (balance == 0.0) {
        println("Account is neutral.")
    } else {
        println("Account is negative")
    }

    when {
        balance > 0.0 -> println("Account is positive.")
        balance == 0.0 -> println("Account is neutral.")
        else -> println("Account is negative")

    }
}