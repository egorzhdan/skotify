package com.egorzh.skotify.api

import kotlin.test.*
import kotlinx.coroutines.experimental.runBlocking

/**
 * @author Egor Zhdan
 */
class TracksTest: APITest() {
    @Test
    fun get() = runBlocking {
        val a = Spotify.getTrack("5BIMPccDwShpXq784RJlJp")
        assertEquals("Enter Sandman", a.name)
        assertEquals(1, a.artists.size)
        assertEquals("Metallica", a.artists[0].name)
        assert(a.previewURL?.isNotBlank() == true)
        assert(!a.explicit)
        assertEquals("Metallica", a.album.name)
        assertEquals(3, a.album.images.size)
    }

    @Test
    fun getWithoutPreviewURL() = runBlocking {
        val a = Spotify.getTrack("7i2DJ88J7jQ8K7zqFX2fW8")
        assertEquals("Now Or Never", a.name)
        assertEquals(1, a.artists.size)
        assertEquals("Halsey", a.artists[0].name)
        assertNull(a.previewURL)
        assert(!a.explicit)
    }
}