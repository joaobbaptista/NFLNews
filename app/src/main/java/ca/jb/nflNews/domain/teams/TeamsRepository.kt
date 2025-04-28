package ca.jb.nflNews.domain.teams

import ca.jb.nflNews.core.data.TeamResponse
import kotlinx.coroutines.flow.Flow

interface TeamsRepository {
    fun provideTeams() : Flow<List<TeamResponse>>
}