package domain

class User (val name: String, val email: String) {

    private var level: Int = 0
    private var reputation: Int = 0

    fun levelUP(increase: Int): Boolean {
        if(increase <= 0) return false
        level += increase
        return true
    }

    fun getLevel() : Int {
        return level
    }

    fun increaseReputation(increaseValue: Int): Boolean {
        if(increaseValue <= 0) return false
        reputation += increaseValue
        return true
    }

    fun getReputation() : Int {
        return reputation
    }

    override fun toString(): String {
        return "User(name='$name', email='$email', level=$level, reputation=$reputation)"
    }


}