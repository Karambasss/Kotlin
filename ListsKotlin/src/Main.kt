fun main() {
    var a: Array<Int> = Array(2, {it})
    println(a.contentToString()) //Вывод списка с помощью функции

    //Перебор списка
    a.forEach {el -> println("Hello, $el") }

    a.forEachIndexed { index, el -> println("Элемент $el с индексом $index") }

    a.forEachIndexed(action = {index: Int, i: Int -> println("Элемент $i с индексом $index")})

}
