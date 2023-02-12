class Manager(
    name: String,
    cpf: String,
    wege: Double,
    password: Int
) : AdminEmployee(
    name = name,
    cpf = cpf,
    wege = wege,
    password = password
), Authenticated {

    override val bonus: Double
        get() {
            return wege
        }

    override fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}