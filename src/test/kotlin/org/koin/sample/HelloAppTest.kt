package org.koin.sample

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.standalone.inject
import org.koin.test.AutoCloseKoinTest

class HelloAppTest : AutoCloseKoinTest() {

    val model by inject<HelloModel>()
    val service by inject<HelloService>()

    @Before
    fun before() {
        startKoin(listOf(helloModule))
    }

    @Test
    fun tesKoinComponents() {
        val helloApp = HelloApplication()
        assertEquals(service, helloApp.helloService)
        assertEquals("Hello ${model.message}", service.hello())
    }
}