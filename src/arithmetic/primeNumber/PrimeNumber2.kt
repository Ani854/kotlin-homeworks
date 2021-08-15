package arithmetic

import java.util.*

fun Int.isPrime() = this > 1 && (2..(this / 2)).all { this % it != 0 }
fun main() {
    val scan = Scanner(System.`in`)
    val num = scan.nextLine().trim().toInt()
    isPrime(num)
}