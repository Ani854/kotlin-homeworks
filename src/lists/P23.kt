package lists

import kotlin.random.Random

fun main() {
    println(lotto(3, 24))
}

fun lotto(from: Int, to: Int): List<Int> {
    return List(3) { Random.nextInt(from, to) }
}