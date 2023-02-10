class Assistant(
    name: String,
    cpf: String,
    wege: Double,
) : Employee(
    name = name,
    cpf = cpf,
    wege = wege
) {
    override fun bonus(): Double {
        return wege * 0.05
    }

}