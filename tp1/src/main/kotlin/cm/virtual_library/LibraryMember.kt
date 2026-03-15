package org.example.cm.virtual_library

data class LibraryMember(
    val name: String,
    val membershipId: String,
    val borrowedBooks: List<String>
)