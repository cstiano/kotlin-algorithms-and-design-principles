package algorithms.datastructures

class Node<T>(var value: T, var next: Node<T>? = null) {

    fun appendToTail(value: T) {
        var n: Node<T> = this
        while (n.next != null) {
            n = n.next!!
        }
        n.next = Node(value)
    }
}