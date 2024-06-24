
open class User(val id: Int, val name: String) {
    private val borrowedBooks = mutableListOf<Book>()

    fun borrowBook(book: Book): Boolean {
        return if (book.isAvailable) {
            book.isAvailable = false
            borrowedBooks.add(book)
            println("$name borrowed ${book.title}")
            true
        } else {
            println("${book.title} is not available")
            false
        }
    }

    fun returnBook(book: Book): Boolean {
        return if (borrowedBooks.contains(book)) {
            book.isAvailable = true
            borrowedBooks.remove(book)
            println("$name returned ${book.title}")
            true
        } else {
            println("$name did not borrow ${book.title}")
            false
        }
    }

    fun listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            println("$name has not borrowed any books.")
        } else {
            println("$name has borrowed the following books:")
            borrowedBooks.forEach { println(it.title) }
        }
    }
}
