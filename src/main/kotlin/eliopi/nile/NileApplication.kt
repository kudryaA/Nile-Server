package eliopi.nile

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class NileApplication

fun main(args: Array<String>) {
    runApplication<NileApplication>(*args)
}
