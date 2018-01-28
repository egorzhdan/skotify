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

    @Test
    fun topTracks() = runBlocking {
        val a = Spotify.getTopTracks("0gxyHStUsqpMadRV0Di1Qt")
        assertTrue(a.isNotEmpty())
        assertEquals(a.first().artists.first().name, "Rick Astley")
    }

    @Test
    fun topTracksHelper() = runBlocking {
        val a = Spotify.getArtist("0gxyHStUsqpMadRV0Di1Qt").getTopTracks()
        assertTrue(a.isNotEmpty())
        assertEquals(a.first().artists.first().name, "Rick Astley")
    }
}