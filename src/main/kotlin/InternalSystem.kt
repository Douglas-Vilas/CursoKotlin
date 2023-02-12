class InternalSystem {

    fun enter(admin: Authenticated, password: Int) {
        if (admin.authentic(password)) {
            println("Welcome to Bytebank")
        } else {
            println("Authenticantion Failure")
        }
    }
}

private fun Authenticated.authentic(password: Int): Boolean {
    return authentic(password)
}
