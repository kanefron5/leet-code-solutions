fun main(args: Array<String>) {
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    println(longestCommonPrefix(arrayOf("dog","racecar","car")))
    println(longestCommonPrefix(arrayOf("cir","car")))
    println(longestCommonPrefix(arrayOf("ab","a")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = ""
    for (j in 0..strs.first().lastIndex){
        val c = strs.first()[j]
        for (i in 1 until strs.size){
            if (j > strs[i].lastIndex || strs[i][j] != c) return prefix
        }
        prefix += c
    }
    return prefix
}

//fun longestCommonPrefix(strs: Array<String>): String {
//    var prefix = ""
//    strs.forEachIndexed loop@{ index, s ->
//        if (index == 0) {
//            prefix = s
//            return@loop
//        }
//        var newPrefix = ""
//        s.forEachIndexed { idx, it1 ->
//            if (idx > prefix.lastIndex){
//                prefix = newPrefix
//                return@loop
//            }
//            if (it1 == prefix[idx]) newPrefix += it1
//            else {
//                prefix = newPrefix
//                return@loop
//            }
//        }
//        prefix = newPrefix
//    }
//    return prefix
//}