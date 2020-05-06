package algorithms.crackingthecoding.chp3

import java.util.*

class StackMin : Stack<Int>() {

    var s2: Stack<Int>? = null

    init {
        s2 = Stack<Int>()
    }

    public override fun push(value: Int): Int? {
        if (value <= min()) {
            s2!!.push(value)
        }
        return super.push(value)
    }

    public override fun pop(): Int {
        val value = super.pop()
        if (value == min()) {
            s2!!.pop()
        }
        return value
    }

    public fun min(): Int {
        return if (s2!!.empty()) Integer.MAX_VALUE else s2!!.peek()
    }
}