package logicAndCodes

fun main() {
    print(true.and_(true))
    print(true.equ_(false))
}

inline fun Boolean.not_() = !this
inline fun Boolean.and_(other: Boolean) = this && other
inline fun Boolean.or_(other: Boolean) = this || other
inline fun Boolean.nand_(other: Boolean) = this.and_(other).not_()
inline fun Boolean.nor_(other: Boolean) = this.or_(other).not_()
inline fun Boolean.xor_(other: Boolean) = this.xor(other)
inline fun Boolean.equ_(other: Boolean) = this.xor_(other).not_()
inline fun Boolean.impl_(other: Boolean) = this.or_(other.not_())

fun truthTable(f: (Boolean, Boolean) -> Boolean): List<Row> {
    val list = listOf(Pair(true, true), Pair(true, false), Pair(false, true), Pair(false, false)).map {
        Row(it.first, it.second, f(it.first, it.second))
    }
    return list
}

fun printTruthTable(f: (Boolean, Boolean) -> Boolean) {
    println(listOf("a", "b", "result").joinToString("\t"))
    truthTable(f).forEach {
        println(listOf(it.a, it.b, it.result).joinToString("\t"))
    }
}

data class Row(val a: Boolean, val b: Boolean, val result: Boolean)