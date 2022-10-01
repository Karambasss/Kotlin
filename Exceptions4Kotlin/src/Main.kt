
// реализуйте функцию engineStatus(engineNumber:Int): String,
// которая делает безопасный (с точки зрения необработанных исключений)
// вызов функции rawEngineStatus(engineNumber:Int):String :
//
//если произошло исключение EngineNotFoundException, то вернуть строку "engine <number> not found";
//если произошло исключение SensorsMeltException, то вернуть строку "engine <number> offline";
//если не произошло исключение, то вернуть результат работы rawEngineStatus.
//где <number> - номер двигателя.
//
//Функцию rawEngineStatus и исключения разрабатывать не нужно!
//
//Из консоли/В консоль ничего читать/писать не нужно!


fun main() {
    println("Введите номер двигателя! ")
    val str_input = readLine()!!
    try {
        println(engineStatus(str_input.toInt()))
    }
    catch (e : NumberFormatException){
        println("Error! String $str_input cannot be converted to int!")
    }
}

fun engineStatus(engineNumber: Int) : String{
    val message =  try {
        rawEngineStatus(engineNumber)
    }
    catch (e : SensorsMeltException){
        "engine <$engineNumber> offline"
    }
    catch (e : EngineNotFoundException){
        "engine <$engineNumber> not found"
    }
    return message
}

fun rawEngineStatus(engineNumber : Int) : String{
    return "some status"
}


