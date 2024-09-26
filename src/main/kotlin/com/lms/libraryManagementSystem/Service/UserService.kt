package com.lms.libraryManagementSystem.Service

import com.lms.libraryManagementSystem.Entity.UserEntity
import com.lms.libraryManagementSystem.Json.UserProfile
import com.lms.libraryManagementSystem.Repository.UserRepository
interface UserService {
    fun createNewUser(user: UserProfile): UserEntity
}