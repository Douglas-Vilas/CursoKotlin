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
) {

    override fun bonus(): Double {
        return wege
    }
}