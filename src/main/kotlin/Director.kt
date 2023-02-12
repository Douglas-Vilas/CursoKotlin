class Director(
    name: String,
    cpf: String,
    wege: Double,
    password: Int,
    val plr: Double
) : AdminEmployee(
    name = name,
    cpf = cpf,
    wege = wege,
    password = password
), Authenticated {

    override val bonus: Double
        get() {
            return wege + plr
        }

    override fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}