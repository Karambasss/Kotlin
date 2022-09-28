open class Bug(val rank : Int, val name : String) {

    open fun getSugarLimit() : Int{
        return this.rank
    }

    fun getId() : String{
        return "${this.rank}.${this.name}"
    }
}