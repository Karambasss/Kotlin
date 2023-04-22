package objects


class DoubleLinkedList {
    private var head : Node? = null
    private var tail : Node? = null
    private var size = 0

    fun addFirst(value: Int){
        val newNode = Node(value)
        if (head == null){
            tail = newNode
            size++
        }
        else{
            head?.prev = newNode
            size++
        }
        newNode.next = head
        head = newNode
    }

    fun addLast(value: Int){
        val newNode = Node(value)
        if (head == null){
            head = newNode
            size++
        }
        else{
            tail?.next = newNode
            size++
        }
        newNode.prev = tail
        tail = newNode
    }

    fun addByIndex(index: Int, value: Int){
        val newNode = Node(value)
        var cnt = 0
        var currentNode = head

        if (head == null){
            if (cnt == index){
                tail = newNode
                newNode.next = head
                head = newNode
                size++
            }
            else{
                return
            }
        }
        while (currentNode != null){
            if (cnt == index){
                if (currentNode.prev == null){
                    newNode.next = head
                    head?.prev = newNode
                    head = newNode
                    size++
                    return
                }
                if (currentNode == head && currentNode.next == null){
                    addFirst(value)
                }

                if (currentNode.next == null){
                    newNode.prev = tail
                    tail?.next = newNode
                    tail = newNode
                    size++
                    return
                }

                currentNode.prev?.next = newNode
                newNode.prev = currentNode.prev
                newNode.next = currentNode
                currentNode.prev = newNode
                size++
                return
            }
            cnt++
            currentNode = currentNode.next
        }
    }

    fun removeFirst() {
        if (head == null) {
            size = 0
            return
        }
        if (head?.next == null){
            head = null
            tail = null
            size = 0
            return
        }
        head?.next?.prev = null
        head = head?.next
        size--
    }

    fun removeLast(){
        if (head == null){
            size = 0
            return
        }
        if (tail?.prev == null){
            tail = null
            head = null
            size = 0
            return
        }
        tail?.prev?.next = null
        tail = tail?.prev
        size--
    }

    fun removeByIndex(index : Int){
        if (head == null){
            return
        }
        var currentNode = head
        var cnt = 0
        while (currentNode != null){
            if (cnt == index){
                if (currentNode == head && currentNode.next == null){
                    head = null
                    tail = null
                    size--
                    return
                }
                if (currentNode == head){
                    currentNode.next?.prev = null
                    head = currentNode.next
                    size--
                    return
                }
                else{
                    if (currentNode.next == null){
                        currentNode.prev?.next = null
                        tail = currentNode.prev
                        size--
                        return
                    }
                    currentNode.prev?.next = currentNode.next
                    currentNode.next?.prev = currentNode.prev
                    size--
                    return
                }
            }
            cnt++
            currentNode = currentNode.next
        }
    }

    fun removeByValue(value : Int){
        if (head == null){
            return
        }
        var currentNode = head
        while (currentNode != null){
            if (currentNode.value == value){
                if (currentNode == head && currentNode.next == null){
                    head = null
                    tail = null
                    size--
                    return
                }
                if (currentNode == head){
                    currentNode.next?.prev = null
                    head = currentNode.next
                    size--
                    return
                }
                else{
                    if (currentNode.next == null){
                        currentNode.prev?.next = null
                        tail = currentNode.prev
                        size--
                        return
                    }
                    currentNode.prev?.next = currentNode.next
                    currentNode.next?.prev = currentNode.prev
                    size--
                    return
                }
            }
            currentNode = currentNode.next
        }
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
            if (cnt == index){
                return currentNode
            }
            cnt++
            currentNode = currentNode.next
        }
        return null
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
            currentNode = currentNode.next
        }
        return null
    }

    fun size() = size

    fun printList(){
        var currentNode = head
        while (currentNode != null){
            println(currentNode.value)
            currentNode = currentNode.next
        }
    }
}