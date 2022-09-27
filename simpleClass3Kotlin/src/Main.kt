fun main() {
    println("Первый способ инициализации")

    var sugarStorage = SugarStorage()
    sugarStorage.setVolume(-50)
    println("Ваш баланс: ${sugarStorage.getVolume()}")
    sugarStorage.setVolume(100)
    println("Ваш баланс: ${sugarStorage.getVolume()}")
    sugarStorage.decreaseSugar(100)
    sugarStorage.increaseSugar(200)


    println("Второй способ инициализации") // инициализация с проверкой - в данном случае условие if (volume < 0)  выдаст нам true - присвоит свойству volume значение 0, так как значение, введенное пользователем < 0
    var sugarStorage2 = SugarStorage2(-100) // пример того, как работает init в kotlin - если мы передадим в параметры первичного конструктора volume < 0, тогда при инициализации (init) просто проверится параметр, и если он >= 0, тогда он присвоится свойству класса
    println("Ваш баланс: ${sugarStorage2.volume}")
    sugarStorage2.decreaseSugar(100)
    sugarStorage2.increaseSugar(200)
    println("Версия класса: ${sugarStorage2.getVersion()}")


    println("Третий способ инициализации") // инициализация с проверкой - в данном случае условие if (volume < 0) выдаст нам false - присвоит свойству volume значение, введенное пользователем: 100
    sugarStorage2 = SugarStorage2(100)
    println("Ваш баланс: ${sugarStorage2.volume}")
    sugarStorage2.decreaseSugar(100)
    sugarStorage2.increaseSugar(200)
    println("Версия класса: ${sugarStorage2.getVersion()}")

}