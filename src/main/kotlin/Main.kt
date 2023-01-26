fun main() {
    // Design of a digital Bank
    println("Welcome to Bytebank!")
    println("")

    val angelica = Employee(
        name = "Angélica",
        cpf = "111.111.111-11",
        wege = 1000.0,
    )

    println("Name: ${angelica.name}")
    println("CPF: ${angelica.cpf}")
    println("Wege: ${angelica.wege}")
    println("Bonus: ${angelica.bonus()}")
    println("")

    val douglas = Manager(
        name = "douglas",
        cpf = "222.222.222-22",
        wege = 2000.0,
        password = 1234
    )

    println("Name: ${douglas.name}")
    println("CPF: ${douglas.cpf}")
    println("Wege: ${douglas.wege}")
    println("Bonus: ${douglas.bonus()}")
    println("")

    if (douglas.authentic(1234)) {
        println("Successfully authenticated")
    } else {
        println("Authentication failed")
    }
}





