package test

import model.Client
import model.Director
import model.InternalSystem
import model.Manager

fun testAuthentication() {
    val manager = Manager(
        name = "Douglas",
        cpf = "222.222.222-22",
        wege = 2000.0,
        password = 1234
    )
    val director = Director(
        name = "Maincon",
        cpf = "333.333.333-33",
        wege = 4000.0,
        password = 4000,
        plr = 200.0
    )

    val client = Client(
        name = "Rosiane",
        cpf = "555.555.555-55",
        password = 3412
    )

    val system = InternalSystem()
    system.enter(manager, 1234)
    system.enter(director, 4000)
    system.enter(client, 3412)
}