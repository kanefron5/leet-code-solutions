fun main(args: Array<String>) {
    println(romanToInt("MCMXCIV")) //1994
}

val letters = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000,
)

fun romanToInt(s: String): Int {
    var result = 0
    var i = 0
    while (i != s.length){
        val num = letters[s[i]]!!
        if (i != s.lastIndex) {
            val nextNum = letters[s[i+1]]!!
            val delta = nextNum - num
            if (delta > 0){
                result += delta
                i+=2
                continue
            }
        }
        result += num
        i++
    }
    return result
}