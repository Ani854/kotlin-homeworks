package arithmetic

import arithmetic.coprime.isCoprimeTo
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val num1 = scan.nextLine().trim().toInt()
    val num2 = scan.nextLine().trim().toInt()
    print(isCoprimeTo1(num1,num2))
}

fun isCoprimeTo1(number1: Int, number2: Int): Boolean {
    var max: Int
    var min: Int
    if (number1 > number2) {
        max = number1
        min = number2
    } else {
        max = number2
        min = number1
    }
    var i = 2
    while (i <= max) {
        if (max % i == 0)
            if (min % i == 0) {
                return false
            }
        ++i
    }
    return true
}