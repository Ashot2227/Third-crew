package application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class FirstApplication {}


fun main() {
    runApplication< FirstApplication >()
}