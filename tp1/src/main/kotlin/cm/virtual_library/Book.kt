package org.example.cm.virtual_library

abstract class Book(
    val title: String,
    val author: String,
    private val year: Int,
    copies: Int
) {
    val publicationYear: String
        get() = when {
            year < 1980 -> "Classic"
            year in 1980..2010 -> "Modern"
            else -> "Contemporary"
        }

    var availableCopies: Int = copies
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }

    init {
    }

    abstract fun getStorageInfo(): String

    override fun toString(): String {
        val textoCopias = if (availableCopies == 1) "copy" else "copies"
        return "Title: $title, Author: $author, Era: $publicationYear, Available: $availableCopies $textoCopias"
    }
}