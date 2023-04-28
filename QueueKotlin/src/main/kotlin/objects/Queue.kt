package objects

interface Queue<T> {

    fun enqueue(value : T)

    fun dequeue() : T

    fun peek() : T

    fun isEmpty() : Boolean

    fun size() : Int

}