class Player(var strength : Int = 0, var dexterity : Int = 0, var XP : Int = 0, var LVL : Int = 1,
             var nextLvlXP : Int = 10) {

    // метод для получения опыта
    fun receiveXP(xp : Int){
        this.XP += xp
        if (XP >= nextLvlXP) levelUp()
    }
    //метод для улучшения уровня
    private fun levelUp(){
        this.LVL += 1
        this.strength += if (this.LVL % 2 == 0) 1 else 0 // вызов тернарного оператора
        this.dexterity += if (this.LVL % 2 == 1) 1 else 0 // вызов тернарного оператора
        this.nextLvlXP += 100
        println("Ваш уровень: ${this.LVL}, ваша сила: ${this.strength}, ваша скорость: ${this.dexterity}" +
                ", ваш опыт ${this.XP}, кол-во опыта до повышения на уровень ${this.LVL + 1}: ${this.nextLvlXP}")

    }
}