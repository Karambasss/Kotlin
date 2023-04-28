package objects

import java.lang.IllegalArgumentException

class QueueList<T> : Queue<T> {
    private var list = ArrayList<T>()

    override fun enqueue(value: T) {
        list.add(value)
    }

    override fun dequeue(): T {
        if (!isEmpty()){
            return list.removeAt(0)
        }
        throw IllegalArgumentException("Queue is empty")
    }

    override fun peek(): T {
        if (!isEmpty()){
            return list[0]
        }
        throw IllegalArgumentException("Queue is empty")
    }

    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    override fun size(): Int {
        return list.size
    }

    fun printList() = list
}