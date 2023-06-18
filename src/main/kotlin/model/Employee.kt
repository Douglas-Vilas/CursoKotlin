package model
// Full qualified name

abstract class Employee(
    val name: String,
    val cpf: String,
    val wege: Double,
) {
    abstract val bonus: Double
    }

