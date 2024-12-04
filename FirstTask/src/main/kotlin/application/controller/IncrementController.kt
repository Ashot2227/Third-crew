package application.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import application.service.IncrementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
class IncrementController(
    private val incrementService: IncrementService
) {
    @GetMapping("/{increment}")
    fun increment(@PathVariable("num") n: Long): Long {
        return incrementService.Increment(n)
    }
}