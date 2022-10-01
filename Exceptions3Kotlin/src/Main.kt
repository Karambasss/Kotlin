import java.lang.Exception

//В отличие от своих собратьев, сфинксы туманности Краба -
//вполне законопослушные граждане и не желают ассоциировать себя с криминалом.
//Однако им не слишком доверяют, поэтому решено завести отдельную тревожную кнопку.
//Создайте класс SphinxesException, который наследует класс Exception.
//Из консоли/В консоль ничего читать/писать не нужно!


fun main() {
    val client = readLine()!!
    try {
        checker(client)
    }
    catch (e : Exception){
        println("$client not allowed to come here! ")
    }
}

fun checker(client : String){
    if (client == "sphinx"){
        throw SphinxesException()
    }
    println("Not sphinx")
}