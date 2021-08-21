package lists

fun main() {
    print(last1(listOf(1, 3, 5, 7, 9, 4, 0, 9)))
}

fun <T> last1(list: List<T>): T {
    return list.last()
}

fun <T> last2(list: List<T>): T {
    return list[list.lastIndex]
}
