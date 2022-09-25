fun main() {
    println("Введите день недели!")
    println("Введите ранг пришельца!")
    println("Введите количество денежных средств!")
    println(calcBugMoneyValue(readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt()))
}

/**
 * Метод позволяет пересчитать деньги
 * @param dayNumber день недели
 * @param bugRank ранг пришельца
 * @param cashAmount количество денежных средств
 * @return количество кг сахара
 */
fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, cashAmount: Int) : Int {
    val exchangeRate : Int = (dayNumber * bugRank) + 42 //курс обмена 1 денежной единицы
    return cashAmount * exchangeRate
}