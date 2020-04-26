package algorithms.datastructures

class Tree<T>(var value: T?) {
    val children: MutableList<Tree<T>> = mutableListOf()

    fun size(): Int {
        return children.fold(1, { size, child -> size + child.size() })
    }
    
    fun height(): Int {
        return 1 + (children.map { it.size() }.max() ?: 0)
    }

    fun add(value: T) {
        children.add(Tree(value))
    }
}