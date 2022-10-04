//Создайте null-опасную функцию getLength(str: String?):Int?
//
//Функция должна:
//
//возвращать длину str, если str не равно null;
//возвращать null, если str равно null.
//Постарайтесь сделать решение в одну строку.
//
//Из консоли/В консоль ничего читать/писать не нужно!
//
//Sample Input 1:
//
//MT3C0V5IA7EN2VLEAJYU3PWHJ6X4OGGXIHBHHKLYQZH5738HNVZRTGO0MHGRZGZDKDS9SIQ7S3Q5L9L2QISAXDRW1W7F156SYM
//Sample Output 1:
//
//98
//Sample Input 2:
//
//null
//Sample Output 2:
//
//null
//Sample Input 3:
//
//7VWRKJS1WDNP60772JLVL3SJCZADUIGQ0WGOYYHQ4I0XMMM7OZBXIZJWUG5X8J44YVPGO1396TG0EENYJ8YSNG
//Sample Output 3:
//
//86

fun main() {
    println("Введите строку: ")
    val str_input : String? = readLine()
    println(getLength(str_input))
}

fun getLength(str : String?) : Int?{ // метод может возвращать число или null
    return str?.length?:null // или можно: str?.length. Если будет передан null в строку, тогда будет возврат null, если нет , тогда будет возврат длины строки
}