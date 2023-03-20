package model

interface Authenticated {
    fun authentic(password: Int): Boolean

}