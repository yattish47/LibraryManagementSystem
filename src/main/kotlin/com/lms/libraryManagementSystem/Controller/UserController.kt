package com.lms.libraryManagementSystem.Controller

import com.lms.libraryManagementSystem.Entity.UserEntity
import com.lms.libraryManagementSystem.Json.ApiResponse
import com.lms.libraryManagementSystem.Json.UserProfile
import com.lms.libraryManagementSystem.Service.UserService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {
    private val log = LoggerFactory.getLogger(UserController::class.java)

    @PostMapping("/new-user")
    fun addNewUser(@RequestBody req: UserProfile): ResponseEntity<ApiResponse<UserEntity>>{
        return try {
          val newUser =  userService.createNewUser(req)
            log.info("New User Created ${req.name}, ${req.age}")
            val response = ApiResponse(
                status = "Success",
                message = "User created successfully",
                data = newUser
            )
            ResponseEntity.status(HttpStatus.CREATED).body(response)
        }catch (e: Exception){
            e.printStackTrace()
            log.info("Failed to create new user ${req.name}")
            val response = ApiResponse<UserEntity>(
                status = "error",
                message = "Failed to create user",
                data = null
            )
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response)
        }

    }
}