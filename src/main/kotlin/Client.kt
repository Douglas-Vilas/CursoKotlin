class Client(
    val name: String,
    val cpf: String,
    val password: Int
) : Authenticated {
    fun authentic(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }

    override fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}