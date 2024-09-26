package com.lms.libraryManagementSystem.Repository

import com.lms.libraryManagementSystem.Entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookEntity,Int> {

}