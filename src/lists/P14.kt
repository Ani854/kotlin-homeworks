package lists

import java.util.*

fun main() {
    println(duplicate(listOf(1, 2, 3, 4, 4, 4)))
    println(duplicateN(3, listOf(1, 2, 2, 3, 4, 4)))
}

fun <T> duplicate(list: List<T>): List<T> =
    list.fold(emptyList()) { l, el ->
        l + el + el
    }

fun <T> duplicateN(n: Int, list: List<T>): List<T> =
    list.fold(emptyList()) { l, el ->
        l + Collections.nCopies(n, el)
    }
