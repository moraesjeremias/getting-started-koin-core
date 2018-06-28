package org.koin.sample

import org.junit.Test
import org.koin.test.AutoCloseKoinTest
import org.koin.test.check

/**
 * Dry run configuration
 */
class DryRunTest : AutoCloseKoinTest() {

    @Test
    fun dryRunTest() {
        check(listOf(helloModule))
    }
}