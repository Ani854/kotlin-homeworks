package lists

fun main() {
    println(penultimate(listOf(1,2,3,4,5,6,7,8,9)))
    println(penultimate2(listOf(1,2,3,4,5,6,7,8,9)))
}
fun <T> penultimate(list: List<T>): T {
    return list[list.lastIndex - 1]
}
fun <T> penultimate2(list: List<T>): T? {
    return list.getOrNull(list.lastIndex - 1)
}