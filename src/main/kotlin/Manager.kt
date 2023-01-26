class Manager(
    val name: String,
    val cpf: String,
    val wege: Double,
    val password: Int
) {

    fun bonus(): Double {
        return wege * 0.2
    }

    fun authentic(password: Int): Boolean {
        if (this.password == password){
            return true
        }
        return false
    }

}