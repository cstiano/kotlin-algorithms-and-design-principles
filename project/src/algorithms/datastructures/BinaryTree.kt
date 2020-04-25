package algorithms.datastructures

class BinaryTree<T>(var value: T?, var left: BinaryTree<T>?, var right: BinaryTree<T>?) {

    fun size(): Int {
        var size = 1
        if (left != null) {
            size += left!!.size()
        }
        if (right != null) {
            size += right!!.size()
        }
        return size
    }

    fun height(): Int {
        val left = if (left == null) 0 else left!!.height()
        val right = if (right == null) 0 else right!!.height()
        return maxOf(left, right) + 1
    }
}