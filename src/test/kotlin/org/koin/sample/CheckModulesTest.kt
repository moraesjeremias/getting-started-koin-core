package org.koin.sample

import org.junit.Test
import org.koin.test.AutoCloseKoinTest
import org.koin.test.checkModules

/**
 * Dry run configuration
 */
class CheckModulesTest : AutoCloseKoinTest() {

    @Test
    fun dryRunTest() {
        checkModules(listOf(helloModule))
    }
}