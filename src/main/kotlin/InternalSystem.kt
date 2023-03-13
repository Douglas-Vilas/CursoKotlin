class InternalSystem {

    fun enter(admin: Authenticated, password: Int) {
        if (admin.authentic(password)) {
            println("Welcome to Bytebank")
        } else {
            println("Authenticantion Failure")
        }
    }
}

