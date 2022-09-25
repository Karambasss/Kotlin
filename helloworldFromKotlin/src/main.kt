fun main() {
//    println("Hello brave citizen of glorious Bug Kingdom!")
//    var a = "8"
//    println(a.toInt() + 10)
//    println("Your number: $a")
//    val name : String? = readLine()
//    val last_name: String? = readLine()
//
//    println("Привет! Имя : $name, Фамилия $last_name")
//    val name : String? = readLine()
//    println("Oh mighty ruler of Bug Kingdom, the earthling called $name seeks for your wisdom!")
    println(sum()) // Значение по умолчанию подставится
    println(sum(a = 9)) // Именнованный параметр a со значением 9
    println(sum(b = 10)) // Именнованный параметр b со значением 10
    println(sum(9, 10)) // Стандартный вызов и функции с параметрами
    println(sum(a = 10, b = 20)) // Именнованные параметры с переданными значениями

    val sum_user : String? = readLine()

    if (sum_user == null) return

    val sum : Int = sum_user.toInt()

    val tax : Double = calcTax(sum)

    println("Для $sum сумма налога составит $tax")

}
// Можно указывать параметрам функций значения по умолчанию
fun sum (a : Int = 0, b : Int = 7) : Int {
    return a + b
}

// Вычисление налога
fun calcTax(sum : Int = 1000) : Double {
    val tax_ratio = 0.13
    return tax_ratio * sum.toDouble()
}