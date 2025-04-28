package ca.jb.nflNews.core.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LinkResponse(
    val language: String,
    val rel: List<String>,
    val href: String,
    val text: String,
    val shortText: String,
    val isExternal: Boolean,
    val isPremium: Boolean,
    val isHidden: Boolean
)