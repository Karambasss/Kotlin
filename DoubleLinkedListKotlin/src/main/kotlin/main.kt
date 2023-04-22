import objects.DoubleLinkedList

// Двусвязный список

fun main() {
    val linkedList = DoubleLinkedList()

    // Добавление в начало
    println("Добавление элементов")
    linkedList.addFirst(1)
    // Добавление в конец
    linkedList.addLast(5)
    linkedList.addLast(2)
    linkedList.addFirst(3)
    linkedList.printList()
    println("Размер списка: ${linkedList.size()}")
    println("-----------------------------------------------------------------------------------------------------------")
    // Добавление по индексу
    println("Добавление элементов по индексу")
    linkedList.addByIndex(0,15)
    linkedList.addByIndex(linkedList.size()-1, 20)
    linkedList.addByIndex(2, 5)
    linkedList.addByIndex(4, 7)
    linkedList.printList()
    println("Размер списка: ${linkedList.size()}")
    println("-----------------------------------------------------------------------------------------------------------")
    // Удаление
    // Удаление первого
    println("Удаление первого элемента")
    linkedList.removeFirst()
    linkedList.printList()
    println("Размер списка: ${linkedList.size()}")
    println()
    // Удаление последнего
    println("Удаление последнего элемента")
    linkedList.removeLast()
    linkedList.printList()
    println("Размер списка: ${linkedList.size()}")
    println()
    //Удаление по индексу
    println("Удаление элемента по индексу")
    linkedList.removeByIndex(3)
    linkedList.printList()
    println("Размер списка: ${linkedList.size()}")
    println()
    // Удаление по значению
    println("Удаление элемента по значению")
    linkedList.removeByValue(1)
    linkedList.printList()
    println("Размер списка: ${linkedList.size()}")
    // Поиск по индексу
    println("-----------------------------------------------------------------------------------------------------------")
    println("Поиск по индексу")
    var node = linkedList.findByIndex(linkedList.size()-3)
    if (node == null){
        println("Элемент с указанным индексом не найден!")
    }
    else{
        println("Элемент списка с указанным индексом найден! \nЕго данные : ${node.value}")
    }
    // Поиск по значению
    println()
    println("Поиск по значению")
    node = linkedList.findByValue(2)
    if (node == null){
        println("Элемент с указанным значением не найден!")
    }
    else{
        println("Элемент списка с указанным значением найден! \nЕго данные : ${node.value}")
    }
}