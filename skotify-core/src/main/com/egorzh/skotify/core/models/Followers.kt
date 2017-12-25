package com.egorzh.skotify.core.models

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable
import com.egorzh.skotify.core.SpotifyObject

/**
 * @author Egor Zhdan
 */
@Serializable
data class Followers(
        @Optional val href: String? = null,
        val total: Int
) : SpotifyObject