fun main(args: Array<String>) {
    println(longestPalindrome("bb"))
}

fun longestPalindrome(s: String): String {
    var maxLen = 0
    var substStartIdx = 0
    for (index in s.indices){
        var left = index
        var right = index
        while (left >= 0 && right <= s.lastIndex && s[left] == s[right]) {
            left--
            right++
        }
        if (maxLen < right - left - 1) {
            maxLen = right - left - 1
            substStartIdx = left + 1
        }

        left = index - 1
        right = index
        while (left >= 0 && right <= s.lastIndex && s[left] == s[right]) {
            left--
            right++
        }
        if (maxLen < right - left - 1) {
            maxLen = right - left - 1
            substStartIdx = left + 1
        }
    }

    return s.substring(substStartIdx, substStartIdx + maxLen)
}