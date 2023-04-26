package objects

class Node(var value : Int) {
    var left : Node? = null
    var right : Node? = null

    override fun toString(): String {
        return "Ветка со значением $value"
    }
}