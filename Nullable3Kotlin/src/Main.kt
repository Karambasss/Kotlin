//Создайте (крайне) null-опасную функцию getLength(str: String?):Int
//
//Функция должна:
//
//возвращать длину str, если str не равно null;
//генерировать NullPointerException, если str равно null.
//Постарайтесь сделать решение в одну строку.
//
//Из консоли/В консоль ничего читать/писать не нужно!
//
//Sample Input 1:
//
//Q9FQ0H58DECMM1OMFZ7NJZQ6QEH6HQ7282Q4YI28F9Z64DEPJRCU5YQKVW6GINLUFTHRO6ZM5F5MY6BLCPOWUF8OA
//Sample Output 1:
//
//89
//Sample Input 2:
//
//5I6Q7YUK5KM78J238U57ZIWZXMJKSITOVSKCPQEIZKAEMOVVQMIOLE7SH6XSMMPQZV7KKA7ITNRDRZ4E1XR8Z388QEA54RK
//Sample Output 2:
//
//95
//Sample Input 3:
//
//null
//Sample Output 3:
//
//NullPointerException!!11


fun main() {
    //println("Введите строку: ")
    //val str = readLine()
    try {
        println(getLength("Q9FQ0H58DECMM1OMFZ7NJZQ6QEH6HQ7282Q4YI28F9Z64DEPJRCU5YQKVW6GINLUFTHRO6ZM5F5MY6BLCPOWUF8OA"))
        println(getLength(null))
    }
    catch (e : NullPointerException){
        println("Вы ввели пустую строку!")
    }

}

fun getLength(str: String?):Int{
    return str?.length?:throw NullPointerException()
}