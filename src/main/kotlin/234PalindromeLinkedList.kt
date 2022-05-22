fun main(args: Array<String>) {
    val listNode = ListNode(1).apply {
        next = ListNode(2)
    }

    println(isPalindrome(listNode))
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun isPalindrome(head: ListNode?): Boolean {
    var item = head
    val list = arrayListOf<Int>()
    while (item != null){
        list.add(item.`val`)
        item = item.next
    }
    return list == list.reversed()
}