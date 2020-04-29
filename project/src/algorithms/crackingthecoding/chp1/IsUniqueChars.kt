package algorithms.crackingthecoding.chp1

fun String.isUniqueChars(str: String): Boolean {
    if (str.length > 128) return false

    var charSet = mutableSetOf<Char>()
    for (index in 0 until str.length) {
        if (charSet.contains(str[index])) {
            return false
        }
        charSet.add(str[index])
    }
    return true
}