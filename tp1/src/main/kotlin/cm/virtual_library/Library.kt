package org.example.cm.virtual_library

class Library(val name: String) {

    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        totalBooksCreated++
        println("Book '${book.title}' by ${book.author} has been added to the library.")
    }

    fun borrowBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }

        if (book == null) {
            println("Sorry, book not found.")
            return
        }

        if (book.availableCopies > 0) {
            book.availableCopies = book.availableCopies - 1
            println("Successfully borrowed '${book.title}'. Copies remaining: ${book.availableCopies}")
        } else {
            println("Sorry, '${book.title}' is unavailable.")
        }
    }

    fun returnBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }

        if (book == null) {
            println("Book not found.")
            return
        }

        book.availableCopies = book.availableCopies + 1
        println("Book '${book.title}' returned successfully. Copies available: ${book.availableCopies}")
    }

    fun showBooks() {
        println("\n--- Library Catalog ---")
        for (book in books) {
            println(book)
            println("Storage: ${book.getStorageInfo()}")
            println()
        }
    }

    fun searchByAuthor(author: String) {
        val booksByAuthor = books.filter { it.author.equals(author, ignoreCase = true) }

        if (booksByAuthor.isEmpty()) {
            println("No books found by $author.")
            return
        }

        println("Books by $author:")
        for (book in booksByAuthor) {
            val textoCopias = if (book.availableCopies == 1) "copy available" else "copies available"
            println("- ${book.title} (${book.publicationYear}, ${book.availableCopies} $textoCopias)")
        }
    }

    companion object {
        private var totalBooksCreated = 0

        fun getTotalBooksCreated(): Int {
            return totalBooksCreated
        }
    }
}