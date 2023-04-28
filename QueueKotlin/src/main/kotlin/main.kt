import objects.QueueList
import java.lang.IllegalArgumentException

// Очередь
fun main() {
    var queueList = QueueList<Int>()
    // Добавление элементов
    println("Добавление элементов")
    queueList.enqueue(5)
    queueList.enqueue(7)
    queueList.enqueue(3)
    queueList.enqueue(9)
    println(queueList.printList())
    println("Размер списка : ${queueList.size()}")
    // Удаление первого элемента в очереди
    println("Удаление элементов")
    try {
        queueList.dequeue()
        queueList.dequeue()
    }
    catch (e : IllegalArgumentException){
    }
    println(queueList.printList())
    println("Размер списка : ${queueList.size()}")
    // Получение первого элемента в очереди, но не удаляя его
    println("Получение первого элемента")
    try {
        println("Элемент получен, его данные : ${queueList.peek()}")
    }
    catch (e : IllegalArgumentException){
    }
    println(queueList.printList())
    println("Размер списка : ${queueList.size()}")
}