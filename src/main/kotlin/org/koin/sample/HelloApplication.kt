package org.koin.sample

import org.koin.standalone.KoinComponent
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.standalone.inject

/**
 * HelloApplication - Application Class
 * use HelloService
 */
class HelloApplication : KoinComponent {

    // Inject HelloService
    val helloService by inject<HelloService>()

    // display our data
    fun sayHello() = println(helloService.hello())
}

/**
 * run app from here
 */
fun main(vararg args: String) {

    startKoin(listOf(helloModule))

    HelloApplication().sayHello()
}