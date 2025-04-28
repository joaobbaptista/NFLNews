package ca.jb.nflNews.domain.teams

import ca.jb.nflNews.core.data.TeamDetailResponse
import ca.jb.nflNews.core.data.TeamResponse
import ca.jb.nflNews.core.network.Result
import kotlinx.coroutines.flow.Flow

interface TeamsRepository {
    fun provideTeams() : Flow<Result<List<TeamDetailResponse>>>
}