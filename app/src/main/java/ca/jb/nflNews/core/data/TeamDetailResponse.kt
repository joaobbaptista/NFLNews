package ca.jb.nflNews.core.data


import kotlinx.serialization.Serializable

@Serializable
data class TeamDetailResponse(
    val id: String,
    val uid: String,
    val slug: String,
    val abbreviation: String,
    val displayName: String,
    val shortDisplayName: String,
    val name: String,
    val nickname: String,
    val location: String,
    val color: String,
    val alternateColor: String,
    val isActive: Boolean,
    val isAllStar: Boolean,
    val logos: List<LogoResponse>,
    val links: List<LinkResponse>
)