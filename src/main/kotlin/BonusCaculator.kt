class BonusCaculator {

    // Total company bonus
    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        this.total += employee.bonus()
    }
    fun register(manager: Manager) {
        this.total += manager.bonus()
    }
    fun register(director: Director) {
        this.total += director.bonus()
    }
}