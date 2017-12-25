package com.egorzh.skotify.auth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @author Egor Zhdan
 */
@Serializable
internal data class AccessToken(
        @SerialName("access_token") val token: String,
        @SerialName("token_type") val type: String,
        @SerialName("expires_in") val expiresIn: Int
)