package lists

fun main() {
    print(compress(listOf("a","a","a","b","b","c")))
}
fun <T> compress(list : List<T>):List<T>{
    return list.distinct().toList()
}