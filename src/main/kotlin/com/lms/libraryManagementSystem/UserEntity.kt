package com.lms.libraryManagementSystem

import jakarta.persistence.*

@Entity
@Table(name = "users")
class UserEntity (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    var id: Int = 0,

    @Column(nullable = false, name = "name")
    var name: String = ""
) {
    constructor(): this(0, "");


}