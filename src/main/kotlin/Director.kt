class Director(
     name: String,
     cpf: String,
     wege: Double,
    val password: Int,
    val plr: Double
) : Employee(
    name = name,
    cpf = cpf,
    wege = wege
) {

    override fun bonus(): Double {
        return wege + plr
    }

    fun authentic(password: Int): Boolean {
        if (this.password == password){
            return true
        }
        return false
    }

}