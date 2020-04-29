package algorithms.crackingthecoding.chp1

fun String.compress_solution1(str: String): String {
    var stringCompressed: String = ""
    var countChar = 0
    for (index in 0 until str.length) {
        countChar++
        if (index + 1 >= str.length || str[index] != str[index + 1]) {
            stringCompressed += "" + str[index] + countChar
            countChar = 0
        }
    }
    return if (stringCompressed.length < str.length) stringCompressed else str
}

fun String.compress_solution2(str: String): String {
    var stringCompressed: StringBuilder = StringBuilder()
    var countChar = 0
    for (index in 0 until str.length) {
        countChar++
        if (index + 1 >= str.length || str[index] != str[index + 1]) {
            stringCompressed.append(str[index])
            stringCompressed.append(countChar)
            countChar = 0
        }
    }
    return if (stringCompressed.length < str.length) stringCompressed.toString() else str
}