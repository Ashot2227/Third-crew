package application.controller

import org.springframework.web.bind.annotation.RestController
import application.service.IncrementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
class IncrementController(
    private val incrementService: IncrementService
) {
    @GetMapping("/{increment}")
    fun increment(@PathVariable("increment") n: Long): Long {
        return incrementService.Increment(n)
    }
}