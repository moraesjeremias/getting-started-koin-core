package org.koin.sample

import org.junit.Before
import org.junit.Test
import org.koin.dsl.module.module
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.standalone.inject
import org.koin.test.AutoCloseKoinTest
import org.mockito.Mockito
import org.mockito.Mockito.mock

val mockModule = module {
    bean { mock(HelloService::class.java) }
}

class HelloMockTest : AutoCloseKoinTest() {

    val service: HelloService by inject()

    @Before
    fun before() {
        startKoin(listOf(mockModule))
    }

    @Test
    fun tesKoinComponents() {
        HelloApplication().sayHello()

        Mockito.verify(service).hello()
    }
}