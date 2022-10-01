//Необходимо реализовать функцию checkClient(client : String), которая:
//генерирует DogException в случае, если аргумент client содержит слово "dog"
//генерирует CatException в случае, если аргумент client содержит слово "cat"
//Во всех прочих ситуациях ничего делать не нужно.
//Из консоли/В консоль ничего читать/писать не нужно!



fun main() {
    val client = readLine()!!

    try {
        checkClient(client)
    }
    catch (e : Exception){ // отлавливаем свою ошибку - тип exception() ; можно отловить через catch (e: DogException), catch (e : CatException), но в этом смысла нет, так как излишний код добавляется...
        println("Упс, $client является бандитом.")
    }
}

fun checkClient(client : String){
    when (client) {
        "dog" -> throw DogException()
        "cat" -> throw CatException()
        else -> println("Все хорошо, это не cat и не dog")
    }
}