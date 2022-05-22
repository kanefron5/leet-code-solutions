fun main(args: Array<String>) {
    println(reverse(123))
//    println(reverse(120))
//    println(reverse(-123))
    println(reverse(5123))
    println(reverse(1534236469))
    println(reverse(Int.MAX_VALUE))
}

//fun reverse(x: Int): Int {
//    return try {
//        if (x < 0) -(-x).toString().reversed().toInt()
//        else x.toString().reversed().toInt()
//    } catch (e: NumberFormatException){
//        0
//    }
//}

fun reverse(x: Int): Int {
    var num = x
    var res = 0
    while (num != 0) {
        val curr = num % 10
        if (x > 0 && res < 0) return 0
        if (res > Int.MAX_VALUE / 10 || (res == Int.MAX_VALUE / 10 && curr == 7) ) return 0
        if (res < Int.MIN_VALUE / 10 || (res == Int.MIN_VALUE / 10 && curr == -8) ) return 0
        res = res * 10 + curr
        num /= 10
    }
    return res
}