//Создайте null-безопасную функцию getLength(str: String?):Int ,
// возвращающую длину str, если str не null, и 0 в противном случае.
//
//Из консоли/В консоль ничего читать/писать не нужно!
//
//Sample Input 1:
//
//POUKMONS4W5J5
//Sample Output 1:
//
//13
//Sample Input 2:
//
//P6VW88MWCU5PDPUN8SNLOL4L7DVGVQNKER1UQ
//Sample Output 2:
//
//37
//Sample Input 3:
//
//null
//Sample Output 3:
//
//0


fun main() {
    println("Введите строку: ")
    val str : String? = readLine()
    println(getLength(str))
}

fun getLength(str: String?):Int{
    if (str != null) return str.length
    else return 0
}