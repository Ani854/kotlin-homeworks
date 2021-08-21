package lists

fun main() {
    print(randomPermute(listOf(1,2,3,4,5,6,7,8,9)))
}
fun <T> randomPermute(list: List<T>): List<T> {
   return list.shuffled()
}