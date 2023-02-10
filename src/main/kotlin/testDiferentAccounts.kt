fun testDiferentAccounts() {
    val currentAccount = CurrentAccount(
        titular = "Angélica",
        number = 1000
    )
    val savingsAccount = SavingsAccount(
        titular = "Douglas",
        number = 1001
    )

    currentAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("Current Balance: ${currentAccount.balance}")
    println("Savings Balance: ${savingsAccount.balance}")

    currentAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    println("Current Balance after withdrawal: ${currentAccount.balance}")
    println("Savings Balance after withdrawal: ${savingsAccount.balance}")

    currentAccount.transfer(100.0, savingsAccount)

    println("Current Balance after transfer for savings: ${currentAccount.balance}")
    println("Savings Balance after receiving transfer: ${savingsAccount.balance}")

    savingsAccount.transfer(200.0, currentAccount)

    println("Savings Balance after transfer for current: ${savingsAccount.balance}")
    println("Current Balance after receiving transfer: ${currentAccount.balance}")
}