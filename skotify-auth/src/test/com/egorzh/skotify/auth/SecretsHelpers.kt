package com.egorzh.skotify.auth

import java.io.File
import org.slf4j.LoggerFactory

fun loadSecrets() {
    val file = File("../skotify-auth/src/test/resources/secrets/spotify-secrets.txt")
    if (file.exists()) {
        LoggerFactory.getLogger("TEST").debug("Secrets file found")
        val lines = file.readLines()
        Credentials.clientID = lines[0]
        Credentials.clientSecret = lines[1]
    } else {
        LoggerFactory.getLogger("TEST").debug("Secrets file not found, getting credentials from env")
        Credentials.clientID = System.getenv("SPOTIFY_CLIENT_ID")
        Credentials.clientSecret = System.getenv("SPOTIFY_CLIENT_SECRET")
    }
}