package lists

fun main() {
    print(insertAt('X', 1, "abcd".toList()))
}

fun <T> insertAt(value: T, n: Int, list: List<T>): List<T> {
   return list.take(n) + value + list.drop(n)
}
