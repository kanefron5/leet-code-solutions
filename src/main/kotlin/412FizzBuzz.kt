fun main(args: Array<String>) {
    println(fizzBuzz(3))
    println(fizzBuzz(5))
    println(fizzBuzz(15))
}


fun fizzBuzz(n: Int): List<String> {
    val result = arrayListOf<String>()
    repeat(n) {
        val num = it + 1
        result.add(
            if (num.mod(3) == 0 && num.mod(5) == 0) "FizzBuzz"
            else if (num.mod(3) == 0) "Fizz"
            else if (num.mod(5) == 0) "Buzz"
            else num.toString()
        )
    }
    return result
}