fun main(args: Array<String>) {
    println(maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))))
    println(maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))))
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.sortedBy { it.sum() }.last().sum()
}