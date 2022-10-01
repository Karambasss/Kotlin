import java.lang.NumberFormatException

fun main() {
    println("Введите через запятую слова! ")
    val list = readLine()!!.split(",")
    var sum = 0
    println(list)
    for (el in list){
        sum += try{
            el.toInt()
        }
        catch (e : NumberFormatException){
            0
        }
    }
    println("Sum = $sum")
}