package com.egorzh.skotify.core.models

import com.egorzh.skotify.core.SpotifyObject
import kotlinx.serialization.*

/**
 * @author Egor Zhdan
 */
@Serializable
data class Image(
        @Optional val height: Int? = null,
        @Optional val width: Int? = null,
        val url: String
) : SpotifyObject