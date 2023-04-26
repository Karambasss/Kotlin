import objects.BinaryTree
// Бинарное дерево поиска
fun main() {
    var binaryTree = BinaryTree()

    // Добавление эл-тов
    binaryTree.add(1)
    binaryTree.add(3)
    binaryTree.add(6)
    binaryTree.add(4)
    binaryTree.add(7)
    binaryTree.add(2)
    binaryTree.add(-1)
    binaryTree.add(-3)
    binaryTree.add(0)
    binaryTree.add(5)
    // сортировка по возрастанию
    println("Сортировка по возрастанию")
    binaryTree.inOrderTraverseTree(binaryTree.getRootNode())
    println()
    // сортировка по убыванию
    println("Cортировка по убыванию")
    binaryTree.inPostOrderTraverseTree(binaryTree.getRootNode())
    println("Размер дерева : ${binaryTree.size()}")
    println("-----------------------------------------------------------------------------------------------------------")
    // Поиск по значению
    println("Поиск по значению")
    val node = binaryTree.findNodeByValue(-3)

    if (node == null){
        println("Ветка с указанным значением не найдена!")
    }
    else{
        println("Ветка с указанным значением найдена! \n$node")
    }
    // Удаление по значению
    println("-----------------------------------------------------------------------------------------------------------")
    println("Удаление по значению")
    binaryTree.remove(3)
    println()
    binaryTree.inOrderTraverseTree(binaryTree.getRootNode())
    println("Размер дерева : ${binaryTree.size()}")
}