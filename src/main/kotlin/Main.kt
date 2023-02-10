fun main() {
    // Design of a digital Bank
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

    val system = InternalSystem()
    system.enter(manager, 2000)
    system.enter(director, 4000)
}







