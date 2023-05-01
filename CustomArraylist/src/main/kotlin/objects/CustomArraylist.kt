package objects

class CustomArraylist(private var capacity : Int = 10) {
    private var data = Array(capacity) {0}
    private var currentIndex = 0
    private var size = 0

    fun add(value : Int){
        if (currentIndex > data.size-1){
            increaseCapacity()
            data[currentIndex] = value
        }
        else{
            data[currentIndex] = value
        }
        currentIndex++
        size++
    }

    fun remove(value : Int){
        if (data.isEmpty()) return
        val indexOfValue = data.indexOf(value)
        if (indexOfValue == -1) return
        val newData = Array(data.size) { 0 }
        for (i in 0 until indexOfValue){
            newData[i] = data[i]
        }
        for (i in indexOfValue until data.size-1){
            newData[i] = data[i+1]
        }
        data = newData
        currentIndex--
        size--
    }

    fun contains(value: Int) : Boolean = data.contains(value)

    fun get(index : Int) : Int?{
        if (index > size-1) {
            return null
        }
        if (index > data.size-1){
            return null
        }
        return data[index]
    }

    fun set(index: Int, value: Int){
        if (index > size-1){
            return
        }
        if (index > data.size-1){
            return
        }
        data[index] = value
    }

    fun size() = "Вместимость списка = ${data.size}, размер списка = $size"

    private fun increaseCapacity(){
        capacity *= 2
        val newData = Array(capacity) { 0 }
        for (i in data.indices){
            newData[i] = data[i]
        }
        data = newData
    }

    override fun toString(): String{
        if (size == 0){
            return "Список пустой"
        }
        else{
            val formattedStr = data.joinToString(limit = currentIndex)
            if (formattedStr.last() == '.'){
                return formattedStr.subSequence(0, formattedStr.lastIndex-4).toString()
            }
            return formattedStr
        }
    }
}

