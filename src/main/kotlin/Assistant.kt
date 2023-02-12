class Assistant(
    name: String,
    cpf: String,
    wege: Double,
) : Employee(
    name = name,
    cpf = cpf,
    wege = wege
) {
    override val bonus: Double
        get() {
            return wege * 0.05
        }

}