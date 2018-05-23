package org.koin.sample

// Service interface
interface HelloService {
    fun hello(): String
}

// service class with injected helloModel instance
class HelloServiceImpl(private val helloModel: HelloModel) : HelloService {

    override fun hello() = "Hello ${helloModel.message}"
}