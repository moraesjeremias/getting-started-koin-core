package org.koin.sample

import org.koin.dsl.module.applicationContext

// Koin module
val helloModule = applicationContext {
    bean { HelloModel() }
    bean { HelloServiceImpl(get()) as HelloService }
}