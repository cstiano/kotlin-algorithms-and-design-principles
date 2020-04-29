package algorithms.crackingthecoding.chp3

class FixedMultiStack constructor(val stackSize: Int) {
    private var numberOfStacks = 3
    private var stackCapacity: Int? = null
    private var values: Array<Int>? = null
    private var sizes: Array<Int>? = null

    init {
        stackCapacity = stackSize
        values = Array(stackSize * numberOfStacks) { 0 }
        sizes = Array(numberOfStacks) { 0 }
    }

    public fun push(stackNum: Int, value: Int) {
        if (isFull(stackNum)) throw Exception()
        val oldValue = sizes?.get(stackNum)
        if (oldValue != null) {
            sizes?.set(stackNum - 1, oldValue + 1)
        }
        values?.set(indexOfTop(stackNum), value)
    }

    public fun pop(stackNum: Int): Int {
        if (isEmpty(stackNum)) throw Exception()

        val topIndex = indexOfTop(stackNum)
        val value = values?.get(topIndex)
        values?.set(topIndex, 0)
        val oldValue = sizes?.get(topIndex)
        if (oldValue != null) {
            sizes?.set(topIndex, oldValue - 1)
        }
        return value ?: -1
    }

    private fun isFull(stackNum: Int) = false

    private fun isEmpty(stackNum: Int) = false

    private fun indexOfTop(stackNum: Int) = 0
}