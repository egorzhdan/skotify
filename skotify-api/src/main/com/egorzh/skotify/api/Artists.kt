package com.egorzh.skotify.api

import com.egorzh.skotify.core.models.*

suspend fun Spotify.getArtist(id: String) = getAndParse<Artist>("artists/$id")

suspend fun Spotify.getTopTracks(artistId: String) = getAndParse<TracksList>("artists/$artistId/top-tracks?country=US").tracks // TODO make country a parameter

suspend fun Artist.getTopTracks() = Spotify.getTopTracks(id)
suspend fun SimplifiedArtist.getTopTracks() = Spotify.getTopTracks(id)