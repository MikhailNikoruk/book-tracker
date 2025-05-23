package ru.school57.booktracker.dto

import ru.school57.booktracker.entity.Book


data class BookDto(
    val id: Long,

    val title: String,
    // Название книги. Обязательное поле.

    val author: String,
    // Имя автора книги. Обязательное поле.

    val year: Int,
    // Год издания книги.

    val read: Boolean
    // Признак, прочитана ли книга (true или false)
)

fun Book.toDto() = BookDto(
    id = id!!,
    title,
    author,
    year,
    read
)