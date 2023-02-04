class CurrentAccount(
    titular: String,
    number: Int
) : Account(
    titular = titular,
    number = number
) {
    override fun withdraw(value: Double) {
        val valueWithFee = value + 0.1
        super.withdraw(valueWithFee)
    }
}