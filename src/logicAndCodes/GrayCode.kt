package logicAndCodes

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val num = scan.nextLine().trim().toInt()
    print(grayCodes(num))
}

fun grayCodes(b: Int): List<String> =
    if (b == 0) listOf("")
    else {
        val codes = grayCodes(b - 1)
        codes.map { "0$it" } + codes.asReversed().map { "1$it" }
    }