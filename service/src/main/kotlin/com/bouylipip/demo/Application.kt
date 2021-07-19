package com.bouylipip.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
open class Application {
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
