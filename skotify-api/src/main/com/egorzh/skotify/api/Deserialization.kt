package com.egorzh.skotify.api

import kotlinx.serialization.Serializable
import com.egorzh.skotify.core.models.*

@Serializable
internal class TopTracksList(val tracks: List<Track>)

@Serializable
internal class TracksList(val items: List<Track>)

@Serializable
internal class WrappedTracksList(val tracks: TracksList)

@Serializable
internal class ArtistsList(val items: List<Artist>)

@Serializable
internal class WrappedArtistsList(val artists: ArtistsList)

@Serializable
internal class SimplifiedAlbumsList(val items: List<SimplifiedAlbum>)

@Serializable
internal class WrappedSimplifiedAlbumsList(val albums: SimplifiedAlbumsList)