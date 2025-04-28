package ca.jb.nflNews.core.data


import kotlinx.serialization.Serializable

@Serializable
data class TeamResponse(
    val team: TeamDetailResponse
)