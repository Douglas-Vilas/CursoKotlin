abstract class AdminEmployee(
    val name: String,
    val cpf: String,
    val wege: Double,
    val password: Int
) {
    abstract fun bonus(): Double

    fun authentic(password: Int): Boolean {
        if (this.password == password){
            return true
        }
        return false
    }
}

