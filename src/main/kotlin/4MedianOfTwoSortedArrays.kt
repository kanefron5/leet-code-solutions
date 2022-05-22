fun main(args: Array<String>) {
    println(findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4)))
}

// O(m+n)
//fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
//    val sortedArray = nums1.plus(nums2).sortedArray()
//    return if (sortedArray.size.isEven()) {
//        val firstIdx = sortedArray.size / 2 - 1
//        (sortedArray[firstIdx] + sortedArray[firstIdx + 1]) / 2.0
//    } else {
//        sortedArray[sortedArray.size / 2].toDouble()
//    }
//}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    if (nums1.size > nums2.size) return findMedianSortedArrays(nums2, nums1)
    var low = 0
    var high = nums1.size

    while (low <= high) {
        val middleIndex1 = (low + high) / 2
        val middleIndex2 = (nums1.size + nums2.size + 1) / 2 - middleIndex1

        val left1: Int = if (middleIndex1 == 0) Int.MIN_VALUE else nums1[middleIndex1 - 1]
        val left2: Int = if (middleIndex2 == 0) Int.MIN_VALUE else nums2[middleIndex2 - 1]

        val right1: Int = if (middleIndex1 == nums1.size) Int.MAX_VALUE else nums1[middleIndex1]
        val right2: Int = if (middleIndex2 == nums2.size) Int.MAX_VALUE else nums2[middleIndex2]

        if (left1 <= right2 && left2 <= right1) {
            return if ((nums1.size + nums2.size) % 2 == 0) (maxOf(left1, left2) + minOf(right1, right2)) / 2.0
            else maxOf(left1, left2).toDouble()
        } else if (left1 > right2) high = middleIndex1 - 1
        else low = middleIndex1 + 1;
    }

    return .0
}
