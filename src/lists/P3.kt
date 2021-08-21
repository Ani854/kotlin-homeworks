package lists

fun main() {
    println(nth(5, listOf(1,2,3,4,5,6,7)))
}

fun <T> nth(n: Int, list: List<T>): T {
    if (n < 0) throw Exception("n can't be a negative number")
    if (n > list.size - 1) throw IndexOutOfBoundsException()
    return list[n]
}