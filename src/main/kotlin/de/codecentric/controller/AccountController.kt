package de.codecentric.controller


import de.codecentric.model.CreateUserDTO
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import javax.validation.Valid

@RestController
@RequestMapping("/api", produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
@Validated
class AccountController() {

    @PostMapping("/user")
    internal fun create(@RequestBody @Valid createUserDTO: CreateUserDTO): ResponseEntity<String> {
        return ResponseEntity.created(URI.create("/user/${createUserDTO.email}")).body("ok");
    }

}