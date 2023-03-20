package model

import model.AdminEmployee

class Manager(
    name: String,
    cpf: String,
    wege: Double,
    password: Int
) : AdminEmployee(
    name = name,
    cpf = cpf,
    wege = wege,
    password = password
) {
    override val bonus: Double
        get() {
            return wege
        }
}