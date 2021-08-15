package arithmetic.eulersTotientFunction

import arithmetic.gcd.gcd
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val num = scan.nextLine().trim().toInt()
    print("phi($num) = ${phi(num)}")
}

fun phi(n: Int): Int {
    var result: Int = 1;
    var i: Int = 2
    while (i < n) {
        if (gcd(i, n) == 1)
            result++
        i++
    }
    return result;
}