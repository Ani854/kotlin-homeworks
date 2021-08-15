package arithmetic

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val num1 = scan.nextLine().trim().toInt()
    val num2 = scan.nextLine().trim().toInt()
    myGCD(num1, num2)
}

fun myGCD(number1: Int, number2: Int) {
    var gcd = 1
    var i = 1
    while (i <= number1 && i <= number2) {
        if (number1 % i == 0 && number2 % i == 0)
            gcd = i
        ++i
    }
    println("G.C.D of $number1 and $number2 is $gcd")
}