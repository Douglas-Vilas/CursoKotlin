fun testLoops() {
    var i = 0
    while (i < 5) {
        // Account Details
        val titular: String = "Douglas $i" // val = Cannot be changed(reassigned). var = Can be changed.
        val accountNumber: Int = 1000 + i
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