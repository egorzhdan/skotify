package com.egorzh.skotify.core.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import com.egorzh.skotify.core.SpotifyObject

/**
 * @author Egor Zhdan
 */
@Serializable
data class SimplifiedTrack(
        val artists: List<SimplifiedArtist>,
        @SerialName("available_markets") val availableMarkets: List<String>,
        @SerialName("disc_number") val discNumber: Int,
        @SerialName("duration_ms") val duration: Int, // TODO: make java.lang.Duration
        val explicit: Boolean,
        @SerialName("external_urls") val externalURLs: Map<String, String>,
        val href: String,
        val id: String,
        @SerialName("is_playable") val isPlayable: Boolean,
        @SerialName("linked_from") val linkedTrack: TrackLink,
        val name: String,
        @SerialName("preview_url") val previewURL: String,
        val trackNumber: Int,
        val uri: String
) : SpotifyObject