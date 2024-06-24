import librarymanagement.Library

fun main() {


        val library = Library()

        // Librarians
        val librarian1 = Librarian(1, "khaled the admin")
        library.registerLibrarian(librarian1)

        // Users
        val user1 = User(1, "khaled the user")
        library.registerUser(user1)

        // Books
        val book1 = Book(1, "كاتب التاريخ", "Messi")
        val book2 = Book(2, "لن اعيش في جلباب ابي ", "مش مهم")
        val book3 = Book(3, "Kotlin Programming", "The Author ")

        library.addBook(book1)
        library.addBook(book2)
        library.addBook(book3)

        // Librarian adds books
        librarian1.addBook(book1)
        librarian1.addBook(book2)
        librarian1.addBook(book3)

        // List available books
        librarian1.listAvailableBooks()

        // User borrows a book
        user1.borrowBook(book1)

        // List available books after borrowing
        librarian1.listAvailableBooks()

        // User returns a book
        user1.returnBook(book1)

        // List available books after returning
        librarian1.listAvailableBooks()
    }











//    val library = Library()
//    while (true) {
//        println("\nOptions:")
//        println("1. Add Book\n2. Remove Book\n3. Borrow Book")
//        println("4. Return Book\n5. List Available Books\n6. Check Book Availability")
//        println("7. Exit")
//
//        when (readLine()?.toIntOrNull()) {
//            1 -> {
//                println("Enter Book ID:")
//                val id = readLine()!!.toInt()
//                println("Enter Book Title:")
//                val title = readLine()!!
//                library.addBook(Book(id, title))
//                println("Book added.")
//            }
//            2 -> {
//                println("Enter Book ID to remove:")
//                val id = readLine()!!.toInt()
//                library.removeBook(id)
//                println("Book removed.")
//            }
//            3 -> {
//                println("Enter Book ID to borrow:")
//                val id = readLine()!!.toInt()
//                if (library.borrowBook(id)) {
//                    println("Book borrowed successfully.")
//                } else {
//                    println("Book not available for borrowing.")
//                }
//            }
//            4 -> {
//                println("Enter Book ID to return:")
//                val id = readLine()!!.toInt()
//                library.returnBook(id)
//                println("Book returned.")
//            }
//            5 -> {
//                println("Available Books:")
//                library.displayALLAvailableBooks()
//            }
//            6 -> {
//                println("Enter Book ID to check availability:")
//                val id = readLine()!!.toInt()
//                if (library.isBookAvaliable(id)) {
//                    println("Book is available.")
//                } else {
//                    println("Book is not available.")
//                }
//            }
//            7 -> {
//                println("Exiting...")
//                break
//            }
//            else -> println("Invalid choice!")
//        }
//    }

