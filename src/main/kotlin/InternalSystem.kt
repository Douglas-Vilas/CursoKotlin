class InternalSystem {

    fun enter(admin: AdminEmployee, password: Int) {
        if (admin.authentic(password)) {
            println("Welcome to Bytebank")
        } else {
            println("Authenticantion Failure")
        }
    }
}