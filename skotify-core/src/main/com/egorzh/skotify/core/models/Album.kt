package com.egorzh.skotify.core.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import com.egorzh.skotify.core.SpotifyObject

/**
 * @author Egor Zhdan
 */
@Serializable
data class Album(
        @SerialName("album_type") val albumType: String, // TODO: make enum
        val artists: List<SimplifiedArtist>,
        @SerialName("available_markets") val availableMarkets: List<String>,
        val copyrights: List<Copyright>,
        @SerialName("external_ids") val externalIDs: Map<String, String>,
        @SerialName("external_urls") val externalURLs: Map<String, String>,
        val genres: List<String>,
        val href: String,
        val id: String,
        val images: List<Image>,
        val label: String,
        val name: String,
        val popularity: Int,
        @SerialName("release_date") val releaseDate: String, // TODO make java.util.Date
        @SerialName("release_date_precision") val releaseDatePrecision: String, // TODO make enum
//        val tracks: List<SimplifiedTrack>, // TODO paging
        val uri: String
) : SpotifyObject