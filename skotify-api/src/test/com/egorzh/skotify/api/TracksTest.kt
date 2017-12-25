package com.egorzh.skotify.api

import kotlin.test.*
import kotlinx.coroutines.experimental.runBlocking
import com.egorzh.skotify.auth.loadSecrets

/**
 * @author Egor Zhdan
 */
class TracksTest {
    @Test
    fun get() = runBlocking {
        loadSecrets()
        val a = Spotify.getTrack("5BIMPccDwShpXq784RJlJp")
        assertEquals("Enter Sandman", a.name)
        assertEquals(1, a.artists.size)
        assertEquals("Metallica", a.artists[0].name)
        assert(a.previewURL.isNotBlank())
        assert(!a.explicit)
        assertEquals("Metallica", a.album.name)
    }
}