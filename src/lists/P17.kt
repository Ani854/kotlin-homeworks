package lists

fun main() {
    print(split(5,listOf(1,2,3,4,5,6,7,8,9)))
}
fun <T> split(n: Int, list: List<T>): Pair<List<T>, List<T>> {
    return Pair(list.take(n), list.drop(n))
}