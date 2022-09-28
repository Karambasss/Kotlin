//Расширьте код ПО сахарного хранилища классом для представления невоеннообязанных (гражданских) пришельцев.
//
//Создайте класс-наследник BugCivilian, используя класс Bug в качестве базового.
//
//open class Bug(val rank: Int, val name:String) {
//    open fun getSugarLimit(): Int{
//        return rank
//    }
//
//    fun getId(): String{
//        return "${rank}.${name}"
//    }
//}
//
//Переопределите работу метода getSugarLimit таким образом,
// чтобы он возвращал в два раза меньший результат (подсказка - дробную часть можно отбросить).
//
//Из консоли/в консоль ничего читать/писать не нужно!


fun main() {
    val bugCivilian = BugCivilian(5, "R2D2")
    println(bugCivilian.getId())
    val rank = bugCivilian.getSugarLimit()
    val bug = Bug(rank, bugCivilian.name)
    println(bug.getSugarLimit())
    println(bug.getId())
}