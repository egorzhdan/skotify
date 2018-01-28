package com.egorzh.skotify.api

import kotlin.test.*
import com.egorzh.skotify.auth.loadSecrets

/**
 * @author Egor Zhdan
 */
abstract class APITest {
    @BeforeTest
    internal fun setUp() {
        loadSecrets()
    }
}