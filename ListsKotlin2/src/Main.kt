//Реализуйте функцию calculateWordStat, которая находит самое часто употребляемое слово в строке.
//
//Sample Input 1:
//
//PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC DTQEHGC PDDPEM
//Sample Output 1:
//
//DTQEHGC
//Sample Input 2:
//
//KTTKAP ZSAC RKSLNFE LYAB ZSAC ZSAC NQUZKL LYAB ZSAC KTTKAP ZSAC ZSAC KTTKAP RKSLNFE ZSAC ZSAC RKSLNFE LYAB ZSAC RKSLNFE KTTKAP LYAB RKSLNFE NQUZKL RKSLNFE LYAB RKSLNFE RKSLNFE LYAB RKSLNFE KTTKAP ZSAC RKSLNFE KTTKAP ZSAC LYAB LYAB LYAB RKSLNFE ZSAC
//Sample Output 2:
//
//ZSAC
//Sample Input 3:
//
//BAMMWC ZTSKPZ LLXMOU BAMMWC BAMMWC BAMMWC IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB LLXMOU GSLXNL BAMMWC GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB IFYXBAB GSLXNL IFYXBAB LLXMOU BAMMWC IFYXBAB ZTSKPZ BAMMWC BAMMWC BAMMWC IFYXBAB LLXMOU
//Sample Output 3:
//
//GSLXNL


fun main() {
    println("Введите предложение! ")
    val str_input = readLine()!!
    println("Самое частое слово: ${calculateWordStat(str_input)}")
}

fun calculateWordStat(input : String) : String{
    val list : List<String> = input.split(" ").toList() // разбили строку по пробелу и вставили в список
    val map = list.groupingBy {it}.eachCount() // сгруппировать по элементам одинаковым и посчитать кол-во одинаковых элементов
    //println(map) //важная отладка для понимания работы программы

    // it - неявное имя единственного параметра
    val max_map = map.maxByOrNull { it.value } // возьми самое максимальное по количеству - value (количество одинаковых элементов в строке)

    //println(max_map) //важная отладка для понимания работы программы

    val max_string = max_map!!.key // получили значение ключа - самого слова, которого больше всего в строке
    return max_string
}