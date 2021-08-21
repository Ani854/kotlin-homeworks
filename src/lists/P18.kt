package lists

fun main() {
    print(slice(2,5, listOf(1,2,3,4,5,6,7,8,9)))
}
fun <T> slice(from: Int, to: Int, list: List<T>): List<T> {
   return list.slice((from until to))
}