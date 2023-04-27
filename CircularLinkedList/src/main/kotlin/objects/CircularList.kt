package objects

import java.lang.NullPointerException
import kotlin.coroutines.coroutineContext

class CircularList {
    private var head : Node? = null
    private var tail : Node? = null
    private var size = 0

    fun addByIndex(index : Int, value: Int){
        var currentNode = head
        val newNode = Node(value)
        var previousNode : Node? = null
        var cnt = 0
        if (head == null){
            if (cnt == index){
                tail = newNode
                head = newNode
                size++
            }
        }
        else{
            while (currentNode != null){
                if (cnt == index){
                    if (currentNode == head && currentNode.next == null){
                        newNode.next = head
                        head?.next = newNode
                        tail = head
                        head = newNode
                        size++
                        return
                    }
                    if (currentNode == head){
                        newNode.next = head
                        tail?.next = newNode
                        head = newNode
                        size++
                        return
                    }
                    if (currentNode == tail){
                        newNode.next = tail?.next
                        tail?.next = newNode
                        tail = newNode
                        size++
                        return
                    }
                    previousNode?.next = newNode
                    newNode.next = currentNode
                    size++
                    return
                }
                previousNode = currentNode
                currentNode = currentNode.next
                cnt++
            }
        }
    }

    fun removeByValue(value : Int){
        if (head == null){
            return
        }
        var currentNode = head
        var previousNode : Node? = null
        while (currentNode != null){
            if (value == currentNode.value){
                if (currentNode == head && currentNode.next == null){
                    head = null
                    tail = null
                    size--
                    return
                }
                if (currentNode == head){
                    head = currentNode.next
                    tail?.next = head
                    size--
                    return
                }
                if (currentNode == tail){
                    if (previousNode == head){
                        head?.next = null
                        tail = head
                        size--
                        return
                    }
                    previousNode?.next = tail?.next
                    tail = previousNode
                    size--
                    return
                }
                previousNode?.next = currentNode.next
                size--
                return
            }
            if (currentNode.next == head){
                return
            }
            previousNode = currentNode
            currentNode = currentNode.next
        }
    }

    fun removeByIndex(index : Int){
        if (head == null){
            return
        }
        if (index > size){
            return
        }
        if (index < 0){
            return
        }
        var currentNode = head
        var previousNode : Node? = null
        var cnt = 0
        while (currentNode != null){
            if (index == cnt){
                if (currentNode == head && currentNode.next == null){
                    head = null
                    tail = null
                    size--
                    return
                }
                if (currentNode == head){
                    head = currentNode.next
                    tail?.next = head
                    size--
                    return
                }
                if (currentNode == tail){
                    if (previousNode == head){
                        head?.next = null
                        tail = head
                        size--
                        return
                    }
                    previousNode?.next = tail?.next
                    tail = previousNode
                    size--
                    return
                }
                previousNode?.next = currentNode.next
                size--
                return
            }
            if (currentNode.next == head){
                return
            }
            previousNode = currentNode
            currentNode = currentNode.next
            cnt++
        }
    }

    fun findByValue(value : Int) : Node?{
        if (head == null){
            return null
        }
        var currentNode = head
        while (currentNode != null){
            if (currentNode.value == value){
                return currentNode
            }
            if (currentNode.next == head){
                return null
            }
            currentNode = currentNode.next
        }
        return null
    }

    fun findByIndex(index : Int) : Node?{
        if (head == null){
            return null
        }
        if (index > size){
            return null
        }
        if (index < 0){
            return null
        }
        var currentNode = head
        var cnt = 0
        while (currentNode != null){
            if (index == cnt){
                return currentNode
            }
            if (currentNode.next == head){
                return null
            }
            currentNode = currentNode.next
            cnt++
        }
        return null
    }

    fun printList(){
        var currentNode = head
        while (currentNode != null){
            println("Значение : ${currentNode.value}, следующий элемент имеет значение : ${currentNode.next?.value}")
            currentNode = currentNode.next
            if (currentNode == head){
                break
            }
        }
    }


    fun size() = size
}