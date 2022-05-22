fun main(args: Array<String>) {
    println(numberOfSteps(8))
}

fun numberOfSteps(num: Int): Int {
    var counter = 0
    var mNum = num
    while (mNum != 0) {
        counter++
        if (mNum.isEven()) mNum /= 2
        else mNum -= 1
    }
    return counter
}

fun Int.isEven() = this % 2 == 0