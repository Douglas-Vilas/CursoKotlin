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