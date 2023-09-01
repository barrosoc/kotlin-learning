import kotlin.math.pow

fun main(args: Array<String>) {
    val radius = Math.random() * 10
    val area = Math.PI * radius.pow(2.0)

    print("The Area for a circle with radius ")
    print(radius)
    print(" is ")
    println(area)
}