package arithmetic.primeFactors

import arithmetic.isPrime
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    print(num.primeFactors())
}

fun Int.primeFactors(): List<Int> {
    if (this.isPrime()) return listOf(this)

    val primeFactor = (2..(this / 2))
        .filter { it.isPrime() }
        .find { this % it == 0 }

    return if (primeFactor == null) emptyList()
    else listOf(primeFactor) + (this / primeFactor).primeFactors()
}