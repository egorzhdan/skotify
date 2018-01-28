package com.egorzh.skotify.api

import kotlin.test.*
import kotlinx.coroutines.experimental.runBlocking

/**
 * @author Egor Zhdan
 */
class ArtistsTest: APITest() {
    @Test
    fun get() = runBlocking {
        val a = Spotify.getArtist("0gxyHStUsqpMadRV0Di1Qt")
        assertEquals("Rick Astley", a.name)
    }
}