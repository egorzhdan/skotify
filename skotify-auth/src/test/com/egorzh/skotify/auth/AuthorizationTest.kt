package com.egorzh.skotify.auth

import kotlinx.coroutines.experimental.runBlocking
import kotlin.test.*

/**
 * @author Egor Zhdan
 */
class AuthorizationTest {
    @Test
    fun generateAccessToken() {
        loadSecrets()
        runBlocking {
            Credentials.authorize()
            println(Credentials.accessToken)
            assertNotNull(Credentials.accessToken)
            assert(Credentials.accessToken?.isNotBlank() == true)
        }
    }

}
