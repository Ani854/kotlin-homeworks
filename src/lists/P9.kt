package lists

fun main() {
    println(pack(listOf(1,1,1,2,2,3,4,4,4,4,4,5)))
}
fun <T> pack(list: List<T>): List<List<T>> =
    list.fold(listOf(emptyList())) { a, el ->
        if (a.last().isEmpty() || a.last().last() == el)
            a.dropLast(1) + listOf(a.last() + el)
        else
            a.plusElement(listOf(el))
    }