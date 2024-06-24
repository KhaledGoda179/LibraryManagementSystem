package librarymanagement

import Book
import Librarian
import User

class Library {
    private val books = mutableListOf<Book>()
    private val users = mutableListOf<User>()
    private val librarians = mutableListOf<Librarian>()

    fun addBook(book: Book) {
        books.add(book)
        println("${book.title} by ${book.author} added to the library.")
    }

    fun registerUser(user: User) {
        users.add(user)
        println("User ${user.name} registered.")
    }

    fun registerLibrarian(librarian: Librarian) {
        librarians.add(librarian)
        println("Librarian ${librarian.name} registered.")
    }

    fun findBookByTitle(title: String): Book? {
        return books.find { it.title.equals(title, ignoreCase = true) }
    }

    fun listAvailableBooks() {
        val availableBooks = books.filter { it.isAvailable }
        if (availableBooks.isEmpty()) {
            println("No books available in the library.")
        } else {
            println("Available books in the library:")
            availableBooks.forEach { println("${it.title} by ${it.author}") }
        }
    }
}
