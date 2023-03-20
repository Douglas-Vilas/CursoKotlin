package test

fun testConditions(balance: Double) {
    if (balance > 0.0) {
        println("model.Account is positive.")
    } else if (balance == 0.0) {
        println("model.Account is neutral.")
    } else {
        println("model.Account is negative")
    }

    when {
        balance > 0.0 -> println("model.Account is positive.")
        balance == 0.0 -> println("model.Account is neutral.")
        else -> println("model.Account is negative")
    }
}