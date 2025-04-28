package ca.jb.nflNews.core.domain.mapper

import ca.jb.nflNews.core.data.ListOfTeamsResponse
import ca.jb.nflNews.core.data.TeamDetailResponse

fun ListOfTeamsResponse.toTeamList(): List<TeamDetailResponse> {
    return sports.firstOrNull()
        ?.leagues?.firstOrNull()
        ?.teams?.map { it.team }
        .orEmpty()
}
