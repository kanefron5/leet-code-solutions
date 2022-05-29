fun main(args: Array<String>) {
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    if (nums.isEmpty()) return emptyList()
    nums.sort()
    val res = mutableListOf<List<Int>>()
    nums.forEachIndexed { index, i ->
        var start = index + 1
        var end = nums.lastIndex

        if (index > 0 && i == nums[index - 1]) return@forEachIndexed

        while (start < end) {
            if (end < nums.lastIndex && nums[end] == nums[end + 1]) {
                end--
                continue
            }
            if (i + nums[start] + nums[end] == 0) {
                res.add(listOf(i, nums[start], nums[end]))
                start++
                end--
            } else if (i + nums[start] + nums[end] < 0) {
                start++
            } else {
                end--
            }
        }
    }
    return res
}