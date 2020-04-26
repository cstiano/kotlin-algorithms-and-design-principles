package algorithms.search

fun search(text: String, pattern: String): Int {
    var retVal = -1
    val patternLen = pattern.length
    val textLen = text.length - patternLen
    for (i in 0..textLen) {
        var isFound = true
        for (j in 0 until patternLen) {
            if (text[i + j] != pattern[j]) {
                isFound = false
                break
            }
        }
        if (isFound) {
            retVal = 1
            break
        }
    }
    return retVal
}