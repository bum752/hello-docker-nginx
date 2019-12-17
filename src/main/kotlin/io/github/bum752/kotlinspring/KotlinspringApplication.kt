package io.github.bum752.kotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinspringApplication

fun main(args: Array<String>) {
    runApplication<KotlinspringApplication>(*args)
}

@RestController
class Controller {

    @GetMapping("/")
    fun index(): String {
        return "Hello, world";
    }
}
