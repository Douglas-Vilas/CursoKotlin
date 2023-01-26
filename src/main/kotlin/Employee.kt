class Employee(
    val name: String,
    val cpf: String,
    val wege: Double,
) {
    fun bonus(): Double {
       return wege * 0.1
    }
}