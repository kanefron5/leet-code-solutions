fun main(args: Array<String>) {
    println(twoSum(intArrayOf(3, 2, 4), 6).toList()) //1994
}

val map = hashMapOf<Int, Int>()
fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { index, i -> map[i] = index }
    nums.forEachIndexed { index, i ->
        val i1 = map[target - i] ?: return@forEachIndexed
        if (i1 == index) return@forEachIndexed
        return intArrayOf(index, i1)
    }
    return intArrayOf()
}
