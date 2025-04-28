package ca.jb.nflNews.core.data


import kotlinx.serialization.Serializable

@Serializable
data class LeagueResponse(
    val id: String,
    val uid: String,
    val name: String,
    val abbreviation: String,
    val shortName: String,
    val slug: String,
    val teams: List<TeamResponse>,
    val year: Int,
    val season: SeasonResponse
)