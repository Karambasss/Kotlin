fun main() {
    var nib = NibirunianClass()
    println("Введите имя!")
    nib.createNamePlate(readLine()!!)
    println(nib.namePlate)
}