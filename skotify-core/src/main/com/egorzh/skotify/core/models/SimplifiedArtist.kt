package com.egorzh.skotify.core.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import com.egorzh.skotify.core.SpotifyObject

/**
 * @author Egor Zhdan
 */
@Serializable
data class SimplifiedArtist(
        @SerialName("external_urls") val externalURLs: Map<String, String>,
        val href: String,
        val id: String,
        val name: String,
        val uri: String
) : SpotifyObject