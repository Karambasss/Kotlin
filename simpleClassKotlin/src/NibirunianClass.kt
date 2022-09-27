//Класс должен иметь публичное свойство namePlate : String.
//
//Кроме того, класс должен реализовывать метод createNamePlate (name : String),
//который помещает в поле namePlate строку "Live long and prosper, <name>",
//где <name>  - аргумент name метода createNamePlate.


class NibirunianClass {
    var namePlate : String = ""

    fun createNamePlate(name : String){
        this.namePlate = "Live long and prosper, $name"
    }
}