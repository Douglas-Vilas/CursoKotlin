abstract class AdminEmployee(
     name: String,
     cpf: String,
     wege: Double,
    protected val password: Int
) : Employee(
    name = name,
    cpf = cpf,
    wege = wege
), Authenticated {

    override fun authentic(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}

