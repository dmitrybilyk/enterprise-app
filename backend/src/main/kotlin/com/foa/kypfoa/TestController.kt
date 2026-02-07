package com.foa.kypfoa

import com.foa.common.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class TestController {

    @GetMapping("/test")
    fun test(): Mono<String> {
        val user = User("someName")
        return Mono.just(user.name)
    }
}