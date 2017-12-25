package com.egorzh.skotify.core.models

import kotlinx.serialization.json.JSON
import kotlin.test.*

/**
 * This test only covers objects which are not returned
 * by the Spotify API directly, hence not tested in api module
 *
 * @author Egor Zhdan
 */
class DeserializationTest {
    @Test
    fun followers() {
        val json = "{\"href\" : null, \"total\" : 173176}"
        val f = JSON.nonstrict.parse<Followers>(json)
        assertEquals(173176, f.total)
        assertNull(f.href)
    }
}