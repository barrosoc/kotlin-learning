fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    println(isOrdered(arr))
    println(isOrdered(arr, false))
}

fun isOrdered(array: IntArray, ascending: Boolean = true): Boolean {
    return if (ascending)
        array.contentEquals(array.sortedArray())
    else
        array.contentEquals(array.sortedArrayDescending())
}
