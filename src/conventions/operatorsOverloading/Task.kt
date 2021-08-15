package conventions.operatorsOverloading

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval) =
    addTimeIntervals(timeInterval, 1)

class RecurringTimeInterval(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int) =
    RecurringTimeInterval(this, number)

operator fun MyDate.plus(timeIntervals: RecurringTimeInterval) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
}