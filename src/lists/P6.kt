package lists

fun main() {
    print(isPalindrome(listOf(1, 2, 3, 2, 1)))
}

fun <T> isPalindrome(list: List<T>): Boolean {
    return list == list.reversed()
}
