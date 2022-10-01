import java.lang.NumberFormatException

//Известный инопланетный актер Жук Круз в своем последнем фильме "Задача на Степике невыполнима"
//взламывает суперкомпьютер суперзлодея при помощи суперфункции. Земные хакеры решили разработать аналогичный инструмент.
//Реализуйте функцию exceptionExample(), которая генерирует исключение Exception.
//Из консоли/В консоль ничего читать/писать не нужно!

fun main() {
    val a =  try{
        exceptionExample()
    }
    catch (e : NumberFormatException){
        -1
    }
    println(a)
}


fun exceptionExample(){
    throw NumberFormatException()
}