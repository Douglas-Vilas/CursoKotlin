class Director(
     name: String,
     cpf: String,
     wege: Double,
    val password: Int,
    val prl: Double
) : Employee(
    name = name,
    cpf = cpf,
    wege = wege
) {

//    fun bonus(): Double {
//        return wege * 0.2
//    }

    fun authentic(password: Int): Boolean {
        if (this.password == password){
            return true
        }
        return false
    }

}