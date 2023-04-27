import objects.StackList
import java.lang.IllegalArgumentException

// Стек
fun main() {
    val stackList = StackList<Int>()
    // Добавление элементов
    println("Добавление элементов")
    stackList.push(5)
    stackList.push(1)
    stackList.push(6)
    stackList.push(10)
    println(stackList.printList())
    // Удаление элементов
    println("Удаление элементов")
    try {
        stackList.pop()
        stackList.pop()
    }
    catch (exception : IllegalArgumentException){
        exception.printStackTrace()
    }
    println(stackList.printList())
    // Получение первого элемента
    println("Получение первого элемента")
    try {
        println("Элемент получен, его данные : ${stackList.peek()}")
    }
    catch (exception : IllegalArgumentException){
        exception.printStackTrace()
    }
    println(stackList.printList())
}