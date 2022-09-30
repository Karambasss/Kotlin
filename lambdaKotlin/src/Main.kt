fun main() {
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println(sum(5,5) )

    //Работа лямбда выражений
    val sum1 = { x: Int, y: Int -> x + y }
    println(sum1(10, 10))


    var arr : (String, String) -> String = {string1, string2 ->
        val stringnull = "noOne"
        if (string1.length > string2.length) string1
        else if (string1.length == string2.length) stringnull
        else string2
    }
    println(arr(readLine()!!, readLine()!!))
}