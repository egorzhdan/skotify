package com.egorzh.skotify.core.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Optional
import com.egorzh.skotify.core.SpotifyObject

/**
 * @author Egor Zhdan
 */
@Serializable
data class Track(
        val album: SimplifiedAlbum,
        val artists: List<SimplifiedArtist>,
        @SerialName("available_markets") val availableMarkets: List<String>,
        @SerialName("disc_number") val discNumber: Int,
        @SerialName("duration_ms") val duration: Int, // TODO: make java.lang.Duration
        val explicit: Boolean,
        @SerialName("external_ids") val externalIDs: Map<String, String>,
        @SerialName("external_urls") val externalURLs: Map<String, String>,
        val href: String,
        val id: String,
        @Optional @SerialName("is_playable") val isPlayable: Boolean = true,
        @Optional @SerialName("linked_from") val linkedTrack: TrackLink? = null,
        val name: String,
        val popularity: Int,
        @SerialName("preview_url") val previewURL: String,
        @SerialName("track_number") val trackNumber: Int,
        val uri: String
) : SpotifyObject