//Создайте класс для сахарного хранилища SugarStorage. Класс должен реализовывать следующие методы:
//
//первичный конструктор, инициализирующий начальный баланс хранилища.
//decreaseSugar(v:Int) - уменьшить баланс хранилища на v.
//increaseSugar(v:Int) - увеличить баланс хранилища на v.
//Также класс должен обладать публичным свойством volume:Int, задающим текущий баланс хранилища.
//
//Обратите внимание, что
//
//volume не может быть отрицательным. При попытке уменьшить баланс на величину,
//превышающую volume, значение volume должно становиться нулем.
//decreaseSugar и increaseSugar должны игнорировать отрицательные аргументы.


class SugarStorage {
    private var volume : Int = 0

    fun decreaseSugar(v : Int){
        if (v < 0) return
        val res : Int = this.volume - v
        if (res >= 0) this.volume -= v
        else this.volume = 0
        println("Ваш баланс после уменьшения баланса хранилища на $v: ${this.volume}")
    }

    fun increaseSugar(v : Int){
        if (v < 0) return
        this.volume += v
        println("Ваш баланс после увеличения баланса хранилища на $v: ${this.volume}")
    }

    fun setVolume(v: Int){
     if (v >= 0) this.volume = v
    }

    fun getVolume() : Int{
        return this.volume
    }
}