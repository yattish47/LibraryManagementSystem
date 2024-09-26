package com.lms.libraryManagementSystem.Entity

import jakarta.persistence.*

@Entity
@Table(name = "book")
class BookEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    var id: Int = 0,

    @Column(name = "title", nullable = false)
    var title: String = "",

    @Column(name = "author", nullable = false)
    var author: String = "",

    @Column(name = "borrowed", nullable = false)
    var borrowed: Boolean = false,

) {
    constructor(): this(0, "", "", false)
}