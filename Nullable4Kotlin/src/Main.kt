//Земные бухгалтеры одержали первую значительную победу над инопланетным разумом и
// уговорили пришельцев изменить принцип формирования зарплатных ведомостей.
// Отныне ведомость представляет из себя мешанину из чисел и значений null
// (наиболее точный перевод с языка пришельцев - тяжелый вздох и обреченное согласие с младшей формой жизни после часа
// препирательств). Количество значений null отображает удовлетворенность работой землянина - чем меньше, тем лучше.
//
//Создайте функцию calcNullValues(input: Array<Int?>):Array<Int> ,
// возвращающую массив, первым элементом которого является количество null-значений в массиве input,
// а вторым - сумма всех не-null значений.
//
//Из консоли/В консоль ничего читать/писать не нужно!
//
//Sample Input:
//
//82 null null null null null 7 55 null 59 4 25 null null 66 null 3 62 55 null 42 5 35 8 null
//Sample Output:
//
//11 508


fun main() {
    println("Введите строку ")
    val str : List<String> = readLine()!!.split(" ") // разбиение строки по пробелу
    val array : Array<Int?> = str.map { it.toIntOrNull() }.toTypedArray() // приведение с помощью функции map каждого элемента списка к int или к null. После всего этого список станет с типом List<Int?>, делаем из него Array<Int?> с помощью функции toTypedArray()
    //println(array.forEach { println(it) })
    println(array.contentToString()) // Вывод списка с помощью функции contentToString()

    println(calcNullValues(array).contentToString())
}

fun calcNullValues(input: Array<Int?>) : Array<Int>{
    var sum_null_el = 0
    var sum_not_null_el = 0

    input.forEach {
        if (it == null){
            sum_null_el++
    }
        else{
            sum_not_null_el+=it
        }
    }
    return intArrayOf(sum_null_el,sum_not_null_el).toTypedArray() // создаем int array и приводим к Array<Int>
}