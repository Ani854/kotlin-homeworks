package arithmetic.listOfPrimeNumbers

import arithmetic.isPrime
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val num1 = scan.nextLine().trim().toInt()
    val num2 = scan.nextLine().trim().toInt()
    print(listPrimesInRange(num1..num2))
}

fun listPrimesInRange(range: IntRange): List<Int> = range.filter { it.isPrime() }