package lists

fun main() {
    println(rotate(3,"abcdefghijk".toList() ))
    println(rotate(-2,"abcdefghijk".toList() ))
}

fun <T> rotate(n: Int, list: List<T>): List<T> {
    return if (n > 0) {
        list.drop(n) + list.take(n)
    }
    else{
        list.takeLast(-n) + list.dropLast(-n)
    }
}
