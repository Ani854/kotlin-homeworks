package lists

fun main() {
    println(encode(listOf(1, 1, 1, 2, 3, 3, 4, 4, 4, 4, 4)))
}

fun <T> encode(list: List<T>): List<Pair<Int, T>> {
    val listOfLists: List<List<T>> = pack(list)
    return listOfLists.map { it.size to it.first() }
}