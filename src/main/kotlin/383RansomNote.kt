fun main(args: Array<String>) {
    println(canConstruct("a", "b"))
    println(canConstruct("aa", "ab"))
    println(canConstruct("aa", "aab"))
}


fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val chars = magazine.toMutableList()
    ransomNote.forEach {
        if (it !in chars) return false
        chars.remove(it)
    }
    return true
}