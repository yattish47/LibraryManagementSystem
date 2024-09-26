package com.lms.libraryManagementSystem.Repository

import com.lms.libraryManagementSystem.Entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserEntity, Int> {
}