package test

import model.CurrentAccount
import model.SavingsAccount

fun testCopiesAndReferences() {
    val numberX = 10
    var numberY = numberX
    numberY++

    println("NumberX $numberX")
    println("NumberY $numberY")

    val accountMaicon = CurrentAccount("Maicon", 1002)
    accountMaicon.titular = "Maicon"
    var accountMae = SavingsAccount("Mother", 1003)
    accountMae.titular = "Mother"
    accountMaicon.titular = "Maicon"

    println("Maicon account holder: ${accountMaicon.titular}")
    println("Mother account holder: ${accountMae.titular}")

}