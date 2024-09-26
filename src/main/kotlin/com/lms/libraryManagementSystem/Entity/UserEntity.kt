package com.lms.libraryManagementSystem.Entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class UserEntity (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    var id: Int,

    @Column(nullable = false, name = "name")
    var name: String = "",

    @Column(nullable = false, name = "age")
    var age: Int = 0
) {
    constructor(): this(0, "", 0);


}