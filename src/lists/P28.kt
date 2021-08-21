package lists

fun main() {
    print(lengthSort(listOf(listOf(1,2,3), listOf(1,2,3,4,5), listOf(1,2), listOf(1,2,3,4,5,6,7,8,9))))
}
fun <T> lengthSort(listOfLists: List<List<T>>): List<List<T>> {
    return listOfLists.sortedBy { it.size }
}