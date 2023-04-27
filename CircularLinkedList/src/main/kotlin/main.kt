import objects.CircularList

// Кольцевой список
fun main() {
    val circularList = CircularList()
    // Добавление элементов в начало
    circularList.addByIndex(0, 1)
    circularList.addByIndex(0, 2)
    circularList.addByIndex(0, 3)
    // Добавление элементов в конец
    circularList.addByIndex(circularList.size()-1, 5)
    circularList.addByIndex(circularList.size()-1, 6)
    circularList.addByIndex(circularList.size()-1, 7)
    // Добавление элементов в другие места
    circularList.addByIndex(1, 4)
    circularList.addByIndex(3, 8)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    println("-----------------------------------------------------------------------------------------------------------")
    // Удаление элементов по значению
    println("Удаление первого элемента")
    circularList.removeByValue(3)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    println()
    println("Удаление последнего элемента")
    circularList.removeByValue(7)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    println()
    println("Удаление остальных элементов")
    circularList.removeByValue(8)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    circularList.removeByValue(1)
    println()
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    // Удаление элементов по индексу
    println()
    println("Удаление первого элемента")
    circularList.removeByIndex(0)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    println()
    println("Удаление другого элемента")
    circularList.removeByIndex(1)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    println()
    println("Удаление последнего элемента")
    circularList.removeByIndex(circularList.size()-1)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    println()
    println("Удаление единственного  элемента")
    circularList.removeByIndex(circularList.size()-1)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    println("-----------------------------------------------------------------------------------------------------------")
    // Добавление элементов в список
    // Добавление элементов в начало
    circularList.addByIndex(0, 1)
    circularList.addByIndex(0, 2)
    circularList.addByIndex(0, 3)
    // Добавление элементов в конец
    circularList.addByIndex(circularList.size()-1, 5)
    circularList.addByIndex(circularList.size()-1, 6)
    circularList.addByIndex(circularList.size()-1, 7)
    // Добавление элементов в другие места
    circularList.addByIndex(1, 4)
    circularList.addByIndex(3, 8)
    circularList.printList()
    println("Размер списка: ${circularList.size()}")
    // Поиск по значению
    println("-----------------------------------------------------------------------------------------------------------")
    println("Поиск по значению")
    var node = circularList.findByValue(5)
    if (node == null){
        println("Элемент с указанным значением не найден!")
    }
    else{
        println("Элемент списка с указанным значением найден! \nЕго данные : ${node.value}")
    }
    // Поиск по индексу
    println("-----------------------------------------------------------------------------------------------------------")
    println("Поиск по индексу")
    node = circularList.findByIndex(3)
    if (node == null){
        println("Элемент с указанным индексом не найден!")
    }
    else{
        println("Элемент списка с указанным индексом найден! \nЕго данные : ${node.value}")
    }
}