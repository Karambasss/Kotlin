//Реализуйте функцию getYearEra, которая для введенного в качестве аргумента функции года возвращает один из
// возможных вариантов его положения относительно даты начала Unix-эры (1970 год) в виде строки:
//before
//equals
//after (XX century)
//after (XXI century)
//distant future
//Например:
//2712  -> "distant future"
//1971  -> "after (XX century)"
//1985 -> "after (XX century)"
//2063 -> "after (XXI century)"
//2144 -> "distant future"

fun main() {
    println("Enter your year!")
    val userYear : String = readLine()!!

    println("Our year is ${getYearEra(userYear.toInt())}")
}


fun getYearEra(year : Int) : String{
    val unix_epoch = 1970
    val conversion : Int = year - unix_epoch

    val str_res : String =  when {
        conversion == 0 -> "equals"
        conversion <= -1 -> "before"
        (conversion >= 1) && (conversion <= 30) -> "after (XX century)"
        (conversion >= 31) && (conversion <= 130) -> "after (XXI century)"
        conversion > 130 -> "distant future"
        else -> {
            println("Error")
            return ""
        }
    }
    return str_res
}