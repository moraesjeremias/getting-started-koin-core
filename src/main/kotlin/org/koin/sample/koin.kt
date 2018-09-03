package org.koin.sample

import org.koin.dsl.module.module

// Koin module
val helloModule = module {
    single { HelloMessageData() }
    single<HelloService> { HelloServiceImpl(get()) }
}