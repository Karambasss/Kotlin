package objects

class LinkedList {
    private var head : Node? = null
    private var len : Int = 0

    fun add(value: Int){
        var newNode = Node(value)
        var currentNode = head

        if (head == null){
            head = newNode
            len += 1
        }
        else{
            while (currentNode!!.next != null){
                currentNode = currentNode.next
            }
            currentNode.next = newNode
            len += 1
        }
    }

    fun remove(value : Int){
        if (head == null) {
            return
        }
        var currentNode = head
        var previousNode : Node? = null

        while (currentNode != null){
            if (currentNode.value == value){
                if (currentNode == head && currentNode.next == null){
                    head = null
                    len -= 1
                    return
                }
                if (currentNode == head){
                    head = currentNode.next
                    len -= 1
                    return
                }
                else{
                    if (currentNode.next == null){
                        previousNode?.next = null
                        len -= 1
                        return
                    }
                    val nextNode = currentNode.next
                    currentNode.next = null
                    previousNode?.next = nextNode
                    len -= 1
                    return
                }
            }
            if (currentNode.next == null){
                return
            }
            previousNode = currentNode
            currentNode = currentNode.next
        }
    }

    fun findByIdx(index : Int) : Node?{
        if (head == null){
            return null
        }
        if (len < index){
            return null
        }
        if (index < 0){
            return null
        }
        var currentNode = head
        var cnt = 0
        while (currentNode != null){
            if (cnt == index){
                return currentNode
            }
            currentNode = currentNode.next
            cnt += 1
        }
        return null
    }

    fun findByVal(value : Int) : Node?{
        if (head == null){
            return null
        }
        var currentNode = head
        while (currentNode != null){
            if (currentNode.value == value){
                return currentNode
            }
            currentNode = currentNode.next
        }
        return null
    }

    fun printList(){
        var currentNode = head
        var cnt = 0
        while (currentNode != null){
            println("$cnt элемент = ${currentNode.value}")
            currentNode = currentNode.next
            cnt+=1
        }
    }

    fun length() : Int = len
}