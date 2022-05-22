fun main(args: Array<String>) {
    println(lengthOfLongestSubstring("abcabcbb"))
}

fun lengthOfLongestSubstring(s: String): Int {
    if (s.length == 1) return 1
    var list = mutableListOf<Char>()

    var max = 0
    s.forEach {
        val indexOf = list.indexOf(it)
        if (indexOf >= 0) list = list.subList(indexOf + 1, list.size).toMutableList()
        list.add(it)
        max = maxOf(list.size, max)
    }
    return max
}