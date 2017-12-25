package com.egorzh.skotify.core.models

import kotlinx.serialization.Serializable
import com.egorzh.skotify.core.SpotifyObject

/**
 * @author Egor Zhdan
 */
@Serializable
data class Copyright(
        val text: String,
        val type: String // TODO: make enum
) : SpotifyObject