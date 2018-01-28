package com.egorzh.skotify.api

import kotlin.test.*
import kotlinx.coroutines.experimental.runBlocking

/**
 * @author Egor Zhdan
 */
class SearchTest: APITest() {
    @Test
    fun artist() = runBlocking {
        val a = Spotify.searchArtist("linkin park")
        assertTrue(a.isNotEmpty())
        assertEquals("Linkin Park", a.first().name)
    }

    @Test
    fun album() = runBlocking {
        val a = Spotify.searchAlbums("minutes to midnight")
        assertTrue(a.isNotEmpty())
        assertEquals("Linkin Park", a.first().artists.first().name)
    }

    @Test
    fun track() = runBlocking {
        val a = Spotify.searchTracks("leave out all the rest")
        assertTrue(a.isNotEmpty())
        assertEquals("Linkin Park", a.first().artists.first().name)
    }
}