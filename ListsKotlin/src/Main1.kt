
//Реализуйте функцию getCubeList (n), возвращающую список целых чисел,
// состоящий из кубов порядковых номеров элементов от 0 до n-1 включительно.
// Нумерация начинается с 0.
//Из консоли/В консоль ничего читать/писать не нужно!

//Sample Input 1:
//7
//Sample Output 1:
//0,1,8,27,64,125,216
//Sample Input 2:
//1
//Sample Output 2:
//0
//Sample Input 3:
//9
//Sample Output 3:
//0,1,8,27,64,125,216,343,512

fun main() {
    println("Введите 0, или положительное число! ")
    val n = readLine()!!.toInt()
    val list : List<Int> = getCubeList(n)
    println(list)
}

fun getCubeList(n : Int) : List<Int>{
    if (n < 0){
        println( "Введите 0 или положительное число! ")
        return getCubeList(readLine()!!.toInt())
    }
    var list : List<Int> = List(n, {i -> i * i * i })
    return list
}