package ca.jb.nflNews.core.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SeasonResponse(
    val year: Int,
    val displayName: String
)