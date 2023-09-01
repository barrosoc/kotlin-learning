fun main(args: Array<String>) {
    val number = (2..1000).random()

    println("The prime numbers between 2 and $number are:")

    for(i in 2..number) {
        if (isPrime(i)) println(i)
    }
}

fun isPrime(number: Int): Boolean {
    for(i in 2..<number) {
        if(number % i == 0) return false
    }
    return true
}
