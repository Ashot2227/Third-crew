package application.Service


import application.client.NumberApi
import org.springframework.stereotype.Service


@Service
class IncrementService(
    val numberApi: NumberApi
){
    fun Increment(num: Long) = numberApi.makeRequest(num + 1)
}