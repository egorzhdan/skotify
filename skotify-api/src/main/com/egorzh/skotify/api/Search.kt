package com.egorzh.skotify.api

import java.net.URLEncoder

suspend fun Spotify.searchArtist(query: String) = getAndParse<WrappedArtistsList>("search?q=${URLEncoder.encode(query, "UTF-8")}&type=artist").artists.items

suspend fun Spotify.searchAlbums(query: String) = getAndParse<WrappedSimplifiedAlbumsList>("search?q=${URLEncoder.encode(query, "UTF-8")}&type=album").albums.items

suspend fun Spotify.searchTracks(query: String) = getAndParse<WrappedTracksList>("search?q=${URLEncoder.encode(query, "UTF-8")}&type=track").tracks.items