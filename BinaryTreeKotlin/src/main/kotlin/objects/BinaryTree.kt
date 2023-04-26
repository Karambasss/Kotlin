package objects

class BinaryTree {
    private var rootNode : Node? = null
    private var size = 0

    fun add(value : Int){
        val newNode = Node(value)
        var currentNode = rootNode
        var parent : Node?

        if (rootNode == null){
            rootNode = newNode
            size++
            return
        }
        else{
            while (true){
                parent = currentNode
                if (value == currentNode!!.value){
                    return
                }
                if (value < currentNode.value){
                    currentNode = currentNode.left
                    if (currentNode == null){
                        parent?.left = newNode
                        size++
                        return
                    }
                }
                else{
                    currentNode = currentNode.right
                    if (currentNode == null){
                        parent?.right = newNode
                        size++
                        return
                    }
                }
            }
        }
    }

    fun remove(value : Int){
        if (rootNode == null){
            return
        }
        var currentNode = rootNode
        var parent : Node? = null
        var isItALeftChild = true

        while (currentNode?.value != value){
            parent = currentNode
            if (currentNode == null){
                return
            }
            if (value < currentNode.value){
                currentNode = currentNode.left
                isItALeftChild = true
            }
            else{
                currentNode = currentNode.right
                isItALeftChild = false
            }
        }
        if (currentNode.left == null && currentNode.right == null){
            if (currentNode == rootNode){
                rootNode = null
                size--
            }
            else if (isItALeftChild){
                parent?.left = null
                size--
            }
            else{
                parent?.right = null
                size--
            }
        }
        else if (currentNode.right == null){
            if (currentNode == rootNode){
                rootNode = currentNode.left
                size--
            }
            else if (isItALeftChild){
                parent?.left = currentNode.left
                size--
            }
            else{
                parent?.right = currentNode.left
                size--
            }
        }
        else if (currentNode.left == null){
            if (currentNode == rootNode){
                rootNode = currentNode.right
                size--
            }
            else if (isItALeftChild){
                parent?.left = currentNode.right
                size--
            }
            else{
                parent?.right = currentNode.right
                size--
            }
        }
        else{

            var replacement = getReplacementNode(currentNode)
            if (replacement == rootNode){
                rootNode = replacement
            }
            else if (isItALeftChild){
                parent?.left = replacement
            }
            else{
                parent?.right = replacement
            }
            replacement.left = currentNode.left
            size--
        }
    }

    private fun getReplacementNode(replacedNode : Node) : Node{
        var replacementParent = replacedNode
        var replacement = replacedNode

        var currentNode = replacedNode.right

        while (currentNode != null){
            replacementParent = replacement

            replacement = currentNode

            currentNode = currentNode.left

        }
        if (replacement != replacedNode.right){
            replacementParent.left = replacement.right
            replacement.right = replacedNode.right
        }
        return replacement
    }


    fun findNodeByValue(value: Int) : Node?{

        if (rootNode == null){
            return null
        }
        var currentNode = rootNode
        while (true){
            if (currentNode == null){
                return null
            }
            if (currentNode.value == value){
                return currentNode
            }
            else{
                if (value < currentNode.value){
                    currentNode = currentNode.left
                }
                else{
                    currentNode = currentNode.right
                }
            }
        }
    }

    fun inOrderTraverseTree(focusNode: Node?){
        if (focusNode != null){
            inOrderTraverseTree(focusNode.left)

            println(focusNode)

            inOrderTraverseTree(focusNode.right)
        }
    }

    fun inPostOrderTraverseTree(focusNode: Node?){
        if (focusNode != null){
            inPostOrderTraverseTree(focusNode.right)

            println(focusNode)

            inPostOrderTraverseTree(focusNode.left)
        }
    }

    fun getRootNode() = rootNode

    fun size() = size
}