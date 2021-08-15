package arithmetic

import arithmetic.listOfPrimeNumbers.listPrimesInRange
import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val num1 = scan.nextLine().trim().toInt()
    print(    num1.goldbach())
}

fun Int.goldbach(): Pair<Int, Int> {
    if (this == 2) return Pair(1, 1)
    if (this == 3) return Pair(1, 2)
    val prime = listPrimesInRange(2 until this).find { (this - it).isPrime() } ?: throw IllegalStateException()
    return Pair(prime, this - prime)
}