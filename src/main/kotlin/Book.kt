class Book (var title: String, var author: String, var numPages: Int){
    init {
        if(numPages <= 0)
            numPages = 1
    }
    constructor(title: String): this(title, "Unknown", 1)
}

fun main(args: Array<String>) {
    val book1 = Book("Default constructor", "Carlos", 100)
    val book2 = Book("Secondary constructor")
    val bookNegativeNumPages = Book("Default constructor", "Carlos", -12)

    printBook(book1)
    printBook(book2)
    printBook(bookNegativeNumPages)
}

private fun printBook(book: Book) {
    println("------------")
    println("Book details")
    println("* Title: ${book.title}")
    println("* Author: ${book.author}")
    println("* Number of pages: ${book.numPages}")
}