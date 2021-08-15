package arithmetic.listOfPrimeNumbers

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var low = scan.nextLine().trim().toInt()
    var high = scan.nextLine().trim().toInt()

    while (low < high) {
        if (checkPrimeNumber(low))
            print("$low ")
        ++low
    }
}

fun checkPrimeNumber(num: Int): Boolean {
    var flag = true
    for (i in 2..num / 2) {

        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}