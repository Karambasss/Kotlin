class MagicWeapon(lvl : Int, weight : Double) : Weapon(lvl, weight){
    override fun calcDamage() : Int = super.calcDamage() * 2
}