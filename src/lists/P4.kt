package lists

fun main() {
    var list: List<Int> = listOf(1,2,3,4,5,6,7,8)
    println(length(list))
}

fun <T> length(list: List<T>): Int {
    return list.size
}