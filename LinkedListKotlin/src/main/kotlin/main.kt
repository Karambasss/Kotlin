import objects.LinkedList

// Односвязный список

fun main() {
    var myLinkedList = LinkedList()
    // Добавление элементов
    myLinkedList.add(1)
    myLinkedList.add(3)
    myLinkedList.add(0)
    myLinkedList.add(2)
    myLinkedList.add(1)

    myLinkedList.printList()

    println("Длина списка: ${myLinkedList.length()}")

    println("-------------------------------------------------------------")

    // удаление элементов
    myLinkedList.remove(0)

    myLinkedList.printList()

    println("Длина списка: ${myLinkedList.length()}")

    println("-------------------------------------------------------------")

    println("Поиск элемента по индексу")

    // поиск по индексу
    var node = myLinkedList.findByIdx(1)

    if (node == null){
        println("Элемент с указанным индексом не найден!")
    }
    else{
        println("Элемент списка с указанным индексом найден! \nЕго данные : ${node.value}")
    }

    println("-------------------------------------------------------------")

    println("Поиск элемента по значению")

    // поиск по значению
    node = myLinkedList.findByVal(-9)

    if (node == null){
        println("Элемент с указанным значением не найден!")
    }
    else{
        println("Элемент списка с указанным значением найден! \nЕго данные : ${node.value}")
    }
}