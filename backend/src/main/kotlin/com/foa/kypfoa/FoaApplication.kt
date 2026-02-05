package com.foa.kypfoa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FoaApplication

fun main(args: Array<String>) {
    runApplication<FoaApplication>(*args)
}
