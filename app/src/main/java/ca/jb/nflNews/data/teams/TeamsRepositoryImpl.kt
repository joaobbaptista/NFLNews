package ca.jb.nflNews.data.teams

import ca.jb.nflNews.core.data.TeamResponse
import ca.jb.nflNews.domain.teams.TeamsRepository
import kotlinx.coroutines.flow.Flow

class TeamsRepositoryImpl : TeamsRepository {
    override fun provideTeams(): Flow<List<TeamResponse>> {
        TODO("Not yet implemented")
    }
}