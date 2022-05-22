fun main(args: Array<String>) {
//    println(myAtoi("words and 987"))
    println(myAtoi("2147483648"))
//    println(myAtoi("12345"))
}

fun myAtoi(s: String): Int {
    // 0 - 48
    // 9 - 57
    // - - 45

    val trim = s.trim()
    if (trim.isEmpty()) return 0

    var signFlag = 1

    var cursor = 0
    if (cursor <= trim.lastIndex && trim[cursor] == '+') cursor++
    else if (cursor <= trim.lastIndex && trim[cursor] == '-') {
        cursor++
        signFlag = -1
    }

    var result = 0
    while (cursor <= trim.lastIndex && trim[cursor].isDigit()) {
        val num = trim[cursor] - '0'
        if (result * signFlag > Int.MAX_VALUE / 10 || (result * signFlag == Int.MAX_VALUE / 10 && num >= 7)) return Int.MAX_VALUE
        if (result * signFlag < Int.MIN_VALUE / 10 || (result * signFlag == Int.MIN_VALUE / 10 && num >= 8)) return Int.MIN_VALUE
        result = 10 * result + num
        cursor++
    }

    return result * signFlag
}
