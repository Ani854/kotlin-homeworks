package conventions.forLoop

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var curr: MyDate = start
            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()
                val res = curr
                curr = curr.followingDate()
                return res
            }

            override fun hasNext(): Boolean = curr <= end
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}