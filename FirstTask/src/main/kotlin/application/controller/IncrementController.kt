package application.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import application.service.IncrementService

@RestController
class IncrementController(
    private val IncrementService: IncrementService
) {
    @RequestMapping("/increment", method = [RequestMethod.GET])
    fun increment(@RequestParam("num") n: Int): Int {
        return IncrementService.Increment(n)
    }
}