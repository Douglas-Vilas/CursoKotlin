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
){
    override val bonus: Double
        get() {
            return wege + plr
        }
}
