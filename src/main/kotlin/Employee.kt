open class Employee(
    val name: String,
    val cpf: String,
    val wege: Double,
) {
    open fun bonus(): Double = wege * 0.1
}