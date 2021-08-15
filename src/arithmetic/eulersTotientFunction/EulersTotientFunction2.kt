package arithmetic.eulersTotientFunction
import arithmetic.coprime.isCoprimeTo
import java.util.*

fun Int.totient() = (1..this).filter { it.isCoprimeTo(this) }.size
fun main(){
    val scan = Scanner(System.`in`)
    val num1 = scan.nextLine().trim().toInt()
    print(num1.totient())
}