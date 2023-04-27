package objects

import java.lang.IllegalArgumentException

class StackList<T> : Stack<T> {
    private var list = ArrayList<T>()

    override fun push(value: T) {
        list.add(0, value)
    }

    override fun pop(): T{
        if (!isEmpty()){
            return list.removeAt(0)
        }
        throw IllegalArgumentException("Stack is empty")
    }

    override fun peek(): T {
        if (!isEmpty()){
            return list[0]
        }
        throw IllegalArgumentException("Stack is empty")
    }

    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    override fun size(): Int {
        return list.size
    }

    fun printList() : ArrayList<T>{
        return list
    }
}