open class Weapon(lvl : Int, weight : Double) : Item(lvl, weight) { // наследование от Item
    open fun calcDamage() : Int = 42
}