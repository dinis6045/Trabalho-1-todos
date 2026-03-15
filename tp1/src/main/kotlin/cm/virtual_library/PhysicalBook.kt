package org.example.cm.virtual_library

class PhysicalBook(
    title: String,
    author: String,
    year: Int,
    copies: Int,
    val weight: Int,
    val hasHardcover: Boolean = true
) : Book(title, author, year, copies) {

    override fun getStorageInfo(): String {
        val capa = if (hasHardcover) "Yes" else "No"
        return "Physical book: ${weight}g, Hardcover: $capa"
    }

    override fun toString(): String {
        return super.toString()
    }
}