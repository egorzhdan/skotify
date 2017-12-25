package com.egorzh.skotify.core.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import com.egorzh.skotify.core.SpotifyObject

/**
 * @author Egor Zhdan
 */
@Serializable
data class SimplifiedAlbum(
        @SerialName("album_type") val albumType: String, // TODO: make enum
        val artists: List<SimplifiedArtist>,
        @SerialName("available_markets") val availableMarkets: List<String>,
        @SerialName("external_urls") val externalURLs: Map<String, String>,
        val href: String,
        val id: String,
        // TODO images
        val name: String,
        val uri: String
) : SpotifyObject