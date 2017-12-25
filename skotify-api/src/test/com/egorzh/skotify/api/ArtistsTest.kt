package com.egorzh.skotify.api

import kotlin.test.*
import kotlinx.coroutines.experimental.runBlocking
import com.egorzh.skotify.auth.loadSecrets

/**
 * @author Egor Zhdan
 */
class ArtistsTest {
    @Test
    fun get() = runBlocking {
        loadSecrets()
        val a = Spotify.getArtist("0gxyHStUsqpMadRV0Di1Qt")
        assertEquals("Rick Astley", a.name)
    }
}