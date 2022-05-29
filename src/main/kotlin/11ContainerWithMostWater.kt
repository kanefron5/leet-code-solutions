fun main(args: Array<String>) {
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}

fun maxArea(height: IntArray): Int {
    var max = 0
    var leftIdx = 0
    var rightIdx = height.lastIndex

    while (leftIdx < rightIdx) {
        val width = rightIdx - leftIdx
        val areaHeight = minOf(height[leftIdx], height[rightIdx])
        val area = width * areaHeight
        if (max < area) max = area

        if (height[leftIdx] >= height[rightIdx]) rightIdx--
        else leftIdx++
    }
    return max
}

//fun maxArea(height: IntArray): Int {
//    var max = 0
//    height.forEachIndexed { index1, x1 ->
//        height.forEachIndexed loop2@{ index2, x2 ->
//            if (index2 <= index1) return@loop2
//            val area = minOf(x1, x2) * ((index2) - (index1))
//            if (max < area) max = area
//        }
//    }
//    return max
//}