
class Librarian(id: Int, name: String) : User(id, name) {
    private val libraryBooks = mutableListOf<Book>()

    fun addBook(book: Book) {
        libraryBooks.add(book)
        println("${book.title} by ${book.author} added to the library.")
    }

    fun removeBook(book: Book) {
        if (libraryBooks.remove(book)) {
            println("${book.title} by ${book.author} removed from the library.")
        } else {
            println("${book.title} by ${book.author} is not in the library.")
        }
    }

    fun listAvailableBooks() {
        val availableBooks = libraryBooks.filter { it.isAvailable }
        if (availableBooks.isEmpty()) {
            println("No books available in the library.")
        } else {
            println("Available books in the library:")
            availableBooks.forEach { println("${it.title} by ${it.author}") }
        }
    }

    fun findBookByTitle(title: String): Book? {
        return libraryBooks.find { it.title.equals(title, ignoreCase = true) }
    }
}
