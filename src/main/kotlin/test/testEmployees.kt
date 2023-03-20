package test

import model.*

fun testsEmployees() {
    val angelica = Analyst(
        name = "Angélica",
        cpf = "111.111.111-11",
        wege = 1000.0,
    )

    println("Name: ${angelica.name}")
    println("CPF: ${angelica.cpf}")
    println("Wege: ${angelica.wege}")
    println("Bonus: ${angelica.bonus}")
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
    println("Bonus: ${douglas.bonus}")
    println("")

    if (douglas.authentic(1234)) {
        println("Successfully authenticated")
    } else {
        println("Authentication failed")
    }
    println("")

    val maicon = Director(
        name = "Maicon",
        cpf = "333.333.333-33",
        wege = 4000.00,
        password = 4000,
        plr = 200.0
    )

    println("Name: ${maicon.name}")
    println("CPF: ${maicon.cpf}")
    println("Wege: ${maicon.wege}")
    println("Bonus: ${maicon.bonus}")
    println("PLR: ${maicon.plr}")
    println("")

    if (maicon.authentic(4000)) {
        println("Successfully authenticated")
    } else {
        println("Authentication failed")
    }
    println("")

    val fabio: Employee = Analyst(
        name = "Fábio",
        cpf = "444.444.444-44",
        wege = 3000.0
    )
    println("")

    val caculator = BonusCaculator()
    caculator.register(angelica)
    caculator.register(douglas)
    caculator.register(maicon)
    caculator.register(fabio)

    println("Total bonus: ${caculator.total}")

}