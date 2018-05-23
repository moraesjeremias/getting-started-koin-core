package org.koin.sample

import org.koin.standalone.KoinComponent
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.standalone.inject

// HelloApplication
class HelloApplication : KoinComponent {

    // Inject service
    val helloService by inject<HelloService>()

    init {
        println(helloService.hello())
    }
}

fun main(vararg args: String) {
    startKoin(listOf(helloModule))
    HelloApplication()
}