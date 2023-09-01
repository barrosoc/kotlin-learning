// Defines an array of 10 doubles and for each number prints if its higher or lower than average
fun main(args: Array<String>) {
    val numbers = DoubleArray(10)
    var sum = 0.0

    for(ind in numbers.indices){
        numbers[ind] = Math.random() * 1000
        sum += numbers[ind]
    }

    val average = sum / numbers.size
    println("The average is $average")

    for(ind in numbers.indices){
        val currentNum = numbers[ind]
        print("$currentNum is " + if(numbers[ind] >= average) "bigger" else "lower")
        println(" than the average")
    }
}