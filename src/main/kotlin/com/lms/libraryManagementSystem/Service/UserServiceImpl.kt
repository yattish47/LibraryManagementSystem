package com.lms.libraryManagementSystem.Service

import com.lms.libraryManagementSystem.Entity.UserEntity
import com.lms.libraryManagementSystem.Json.UserProfile
import com.lms.libraryManagementSystem.Repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService
{

    private val log = LoggerFactory.getLogger(UserServiceImpl::class.java)

  override  fun createNewUser(user: UserProfile): UserEntity {
    val newUser = UserEntity().apply {
        name = user.name!!
        age = user.age!!
    }

      val savedUser = userRepository.save(newUser)

      return savedUser
    }

}