class BonusCaculator {

    // Total company bonus
    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        this.total += employee.bonus()
    }

}