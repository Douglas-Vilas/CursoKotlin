class Analyst(
    name: String,
    cpf: String,
    wege: Double,
) : Employee(
    name = name,
    cpf = cpf,
    wege = wege
) {

    override fun bonus(): Double {
        return super.bonus() + wege * 0.1
    }
}