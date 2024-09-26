package com.lms.libraryManagementSystem.Json

data class ApiResponse<T>(
    val status: String,
    val message: String,
    val data: T?
)
