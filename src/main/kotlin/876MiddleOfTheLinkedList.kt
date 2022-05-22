fun main(args: Array<String>) {
    val listNode = ListNode(1).apply {
        next = ListNode(2)
    }

    println(middleNode(listNode))
}

fun middleNode(head: ListNode?): ListNode? {
    var item = head
    val list = arrayListOf<ListNode>()
    while (item != null){
        list.add(item)
        item = item.next
    }
    return list[list.size / 2]
}