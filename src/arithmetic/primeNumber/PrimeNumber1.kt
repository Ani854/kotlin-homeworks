package arithmetic

import java.util.*
import kotlin.math.*

fun main() {
    val scan = Scanner(System.`in`)
    val num = scan.nextLine().trim().toInt()
    isPrime(num)
}

fun isPrime(number: Int) {
    var flag = false
    if (number > 1) {
        for (i in 2..sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                flag = true
                break
            }
        }
    }
    if (flag)
        println("$number is a prime number.")
    else
        println("$number is not a prime number.")
}