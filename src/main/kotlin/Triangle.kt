

fun main(args: Array<String>) {
    val side1 = (Math.random() * 20).toInt()
    val side2 = (Math.random() * 20).toInt()
    val side3 = (Math.random() * 20).toInt()

    var result = "The lengths $side1, $side2 and $side3 a"

    result += if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
        "represent a valid triangle"
    else
        "cannot represents a valid triangle"

    println(result)
}
