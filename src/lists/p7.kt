package lists

fun main() {
    println(flatten(listOf(listOf(1, 2, 3), listOf(20, 3))))
}

fun flatten(list: List<List<Any>>): List<Any> {
    return list.flatten()
}
