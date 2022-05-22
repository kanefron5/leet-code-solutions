fun main(args: Array<String>) {
    println(
        addTwoNumbers(
            listNodeOf(9, 9, 9, 9, 9, 9, 9),
            listNodeOf(9, 9, 9, 9)
        )?.contentToString()
    );
}

fun listNodeOf(vararg value: Int): ListNode? {
    val head = ListNode(0)
    var pointer = head
    value.forEach {
        pointer.next = ListNode(it)
        pointer = pointer.next!!
    }
    return head.next
}

fun ListNode.contentToString(): String {
    var res = "["
    var pointer: ListNode? = this
    while (pointer != null) {
        res += "${pointer.`val`}, "
        pointer = pointer.next
    }
    return res.removeSuffix(", ") + "]"
}

fun ListNode.add(node: ListNode): ListNode {
    this.next = node
    return node
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val head = ListNode(0)

    var pointer1 = l1
    var pointer2 = l2
    var pointer3 = head

    var carryFlag = 0
    while (pointer1 != null || pointer2 != null) {
        val num1 = pointer1?.`val` ?: 0
        val num2 = pointer2?.`val` ?: 0

        var res = num1 + num2 + carryFlag
        carryFlag = if (res >= 10) {
            res %= 10
            1
        } else 0

        pointer3 = pointer3.add(ListNode(res))
        pointer1 = pointer1?.next
        pointer2 = pointer2?.next
    }
    if (carryFlag > 0) pointer3.add(ListNode(carryFlag))
    return head.next
}