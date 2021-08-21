package lists

fun main() {
    println(range(1,20))
}
fun range(from: Int, to: Int): List<Int> {
    return (from..to).toList()
}