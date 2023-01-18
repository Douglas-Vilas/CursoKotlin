fun main() {
    // Design of a digital Bank
    println("Welcome to Bytebank!")

    // Account Details
    val titular = "Douglas" // val = Cannot be changed(reassigned). var = Can be changed.
    val accountNumber = 1000
    var balance = 0.0 // Variable that can change its initial value.
    balance = 100 + 2.0 // Or 100.0
    balance += 200
    balance -= 1000

    println("Titular: $titular") // In Kotlin, we can use the "$" to use the variable inside the string field.
    println("Account Number: $accountNumber")
    println("Account Balance: $balance")

    when {
        balance > 0.0 -> println("Account is positive.")
        balance == 0.0 -> println("Account is neutral.")
        else -> println("Account is negative")
    }
}