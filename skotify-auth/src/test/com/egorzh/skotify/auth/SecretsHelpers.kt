package com.egorzh.skotify.auth

import java.io.File

fun loadSecrets() {
    val lines = File("../skotify-auth/src/test/resources/secrets/spotify-secrets.txt").readLines()
    Credentials.clientID = lines[0]
    Credentials.clientSecret = lines[1]
}