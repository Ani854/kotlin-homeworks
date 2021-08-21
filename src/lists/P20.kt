package lists

fun main() {
    println(removeAt(3, listOf(1,2,3,4,5,6,7,8,9)))
}
fun <T> removeAt(n: Int, list: List<T>): Pair<List<T>, T> {
    val withoutElementN=list-list[n]
    return Pair(withoutElementN,list[n])
}
