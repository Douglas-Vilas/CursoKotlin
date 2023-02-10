class SavingsAccount(
    titular: String,
    number: Int
) : Account(
    titular = titular,
    number = number
) {
    override fun withdraw(value: Double) {
        if(this.balance >= value){
            this.balance -= value
        }
    }
}