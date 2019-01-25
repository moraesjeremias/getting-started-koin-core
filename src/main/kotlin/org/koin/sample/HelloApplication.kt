package org.koin.sample

import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject

/**
 * HelloApplication - Application Class
 * use HelloService
 */
class HelloApplication : KoinComponent {

    // Inject HelloService
    val helloService: HelloService by inject()

    // display our data
    fun sayHello() = println(helloService.hello())
}

/**
 * run app from here
 */
fun main(vararg args: String) {

    startKoin {
        logger()
        modules(helloModule)
    }
    HelloApplication().sayHello()
}