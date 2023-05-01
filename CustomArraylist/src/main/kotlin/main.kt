import objects.CustomArraylist

// Собственный Arraylist

fun main() {
    val arraylist = CustomArraylist(5)
    // Добавление элементов
    println("Добавление элементов")
    arraylist.add(1)
    arraylist.add(2)
    arraylist.add(3)
    arraylist.add(4)
    arraylist.add(5)
    arraylist.add(7)
    println(arraylist)
    println(arraylist.size())
    println("-----------------------------------------------------------------------------------------------------------")
    // Удаление элемента по индексу
    println("Удаление элемента")
    arraylist.remove(5)
    arraylist.remove(2)
    arraylist.remove(7)
    //arraylist.remove(3)
    println(arraylist)
    println(arraylist.size())
    println("-----------------------------------------------------------------------------------------------------------")
    // Проверка на содержание элемента в списке
    println("Проверка элемента в списке")
    val res = arraylist.contains(5)
    if (res){
        println("Указанный элемент присутствует в списке!")
    }
    else{
        println("Указанный элемент отсутствует в списке!")
    }
    println("-----------------------------------------------------------------------------------------------------------")
    // Поиск и получение элемента по индексу
    println("Поиск и получение элемента по индексу")
    val element = arraylist.get(2)
    if (element == null){
        println("Элемент с указанным индексом не найден!")
    }
    else{
        println(element)
    }
    println("-----------------------------------------------------------------------------------------------------------")
    // Поиск и изменение значения элемента по индексу
    println("Поиск и изменение значения элемента по индексу")
    arraylist.set(2,7)
    println(arraylist)
}