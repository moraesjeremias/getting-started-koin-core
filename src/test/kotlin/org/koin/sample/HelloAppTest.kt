package org.koin.sample

import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.koin.test.AutoCloseKoinTest
import org.koin.test.KoinTestRule
import org.koin.test.inject

class HelloAppTest : AutoCloseKoinTest() {

    val model by inject<HelloMessageData>()
    val service by inject<HelloService>()

    @get:Rule
    val koinTestRule = KoinTestRule.create {
        modules(helloModule)
    }

    @Test
    fun `unit test`() {
        val helloApp = HelloApplication()
        helloApp.sayHello()

        assertEquals(service, helloApp.helloService)
        assertEquals("Hey, ${model.message}", service.hello())
    }
}