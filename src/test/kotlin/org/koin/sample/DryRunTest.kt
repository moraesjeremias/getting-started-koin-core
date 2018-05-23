package org.koin.sample

import org.junit.Test
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.test.AutoCloseKoinTest
import org.koin.test.dryRun

/**
 * Dry run configuration
 */
class DryRunTest : AutoCloseKoinTest() {

    @Test
    fun dryRunTest() {
        startKoin(listOf(helloModule))
        dryRun()
    }
}