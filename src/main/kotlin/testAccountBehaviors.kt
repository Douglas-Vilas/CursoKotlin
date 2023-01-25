fun testAccountBehaviors() {
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