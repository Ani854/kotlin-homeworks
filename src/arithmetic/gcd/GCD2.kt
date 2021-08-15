package arithmetic.gcd

import java.util.*

fun gcd(a: Int, b: Int): Int =
    when {
        a == 0 -> b
        a > b -> gcd(b, a)
        else -> gcd(b % a, a)
    }

fun main() {
    val scan = Scanner(System.`in`)
    val num1 = scan.nextLine().trim().toInt()
    val num2 = scan.nextLine().trim().toInt()
    print(gcd(num1, num2))
}