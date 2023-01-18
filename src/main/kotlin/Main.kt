fun main() {
    // Design of a digital Bank
    println("Welcome to Bytebank!")
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

//    testConditions(balance)
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