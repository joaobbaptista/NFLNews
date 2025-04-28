package ca.jb.nflNews.core.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SportResponse(
    val id: String,
    val uid: String,
    val name: String,
    val slug: String,
    val leagues: List<LeagueResponse>
)