class BugCivilian(rank : Int, name : String) : Bug(rank, name) {

    override fun getSugarLimit(): Int {
        return super.getSugarLimit() / 2
    }
}