fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    val mappedArray = map(arr) { x -> x * x }

    for (num in mappedArray) println(num)
}

fun map(arr: IntArray, mappingFunction: (Int) -> Int): IntArray {
    return IntArray(arr.size) { ind -> mappingFunction(arr[ind]) }
}