package de.codecentric.model

import javax.validation.constraints.Email
import javax.validation.constraints.Size

data class CreateUserDTO(

        @Email
        val email: String,

        @Size(min = 8)
        val password: String) {
}