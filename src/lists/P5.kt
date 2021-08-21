package lists

fun main() {
    println(reverse(listOf(1, 2, 3, 1, 2, 3)))
}

fun <T> reverse(list: List<T>): List<T> {
    return list.reversed()
}