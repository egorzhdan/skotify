package com.egorzh.skotify.api

import kotlin.test.*
import kotlinx.coroutines.experimental.runBlocking

/**
 * @author Egor Zhdan
 */
class AlbumsTest: APITest() {
    @Test
    fun get() = runBlocking {
        val a = Spotify.getAlbum("5Eevxp2BCbWq25ZdiXRwYd")
        assertEquals("One More Light", a.name)
        assertEquals(1, a.artists.size)
        assertEquals("Linkin Park", a.artists[0].name)
        assert(a.copyrights.isNotEmpty())
        assert(a.copyrights.first().text.isNotBlank())
        assertEquals(3, a.images.size)
    }
}