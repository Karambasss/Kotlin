class SugarStorage2(var volume : Int = 0) {
    private var version = 5
    init {
        if (volume < 0) this.volume = 0
        else this.volume = volume
    }

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
    fun getVersion() : Int{
        return this.version
    }
}