package arithmetic.coprime

import arithmetic.gcd.gcd
import java.util.*

fun Int.isCoprimeTo(n: Int) = gcd(this, n) == 1
fun main() {
    val scan = Scanner(System.`in`)
    val num1 = scan.nextLine().trim().toInt()
    val num2 = scan.nextLine().trim().toInt()
    print(num1.isCoprimeTo(num2))
}