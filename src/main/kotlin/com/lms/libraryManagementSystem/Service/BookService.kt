package com.lms.libraryManagementSystem.Service

import com.lms.libraryManagementSystem.Repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {

}