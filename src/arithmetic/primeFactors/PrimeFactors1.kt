package arithmetic.primeFactors

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    if (num <= 1) {
        println("No Prime Factor")
    } else {
        val factors = primeFactors(num)
        print("[")
        for (number in factors) {
            print("$number ")
        }
        print("]")
    }

}

private fun primeFactors(num: Int): ArrayList<Int> {
    val arr: ArrayList<Int> = arrayListOf()
    var n = num
    while (n % 2 == 0) {
        arr.add(2)
        n /= 2
    }

    for (i in 3..kotlin.math.sqrt(n.toDouble()).toInt() step 2) {
        while (n % i == 0) {
            arr.add(i)
            n /= i
        }
    }
    if (n > 2) {
        arr.add(n)
    }
    return arr
}
