fun main() {
    println("Введите кол-во пришельцев! ")
    val x : String? = readLine()
    if (x == null) return
    println("Количество стульев ${calcChairs(x.toInt())}, необходимое для того, чтобы посадить $x пришельцев!")
}

// y = x + z
// z = x/2
fun calcChairs(x : Int) : Int{
    val z : Int = x / 2
    return x + z
}

