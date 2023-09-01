fun main(args: Array<String>) {
    val monthNumber = (Math.random() * 12).toInt() + 1

    var result = "Month number $monthNumber corresponds to "
    result += when(monthNumber) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "not a valid month number"
    }

    println(result)
}
