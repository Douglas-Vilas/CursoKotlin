abstract class Employee(
    val name: String,
    val cpf: String,
    val wege: Double,
) {
    abstract fun bonus(): Double
}