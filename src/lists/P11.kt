package lists
fun <T : Any> encodeModifies(list: List<T>): List<Any> =
    pack(list).map {
        when (it.count()) {
            1 -> it.first()
            else -> Pair(it.count(), it.first())
        }
    }
fun main() {
    print(encodeModifies(listOf(1,2,2,2,3,3,4,4,4,4,5)))
}