package ca.jb.nflNews.data.teams

import ca.jb.nflNews.core.data.ListOfTeamsResponse
import ca.jb.nflNews.core.data.TeamDetailResponse
import ca.jb.nflNews.core.domain.mapper.toTeamList
import ca.jb.nflNews.core.network.ApiRoutes
import ca.jb.nflNews.core.network.Result
import ca.jb.nflNews.domain.teams.TeamsRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class TeamsRepositoryImpl(
    private val client: HttpClient,
) : TeamsRepository {
    override fun provideTeams(): Flow<Result<List<TeamDetailResponse>>> = flow {
        emit(Result.Loading)
        try {
            val response = client.get(ApiRoutes.Teams.getTeams()).body<ListOfTeamsResponse>()
            val teams = response.toTeamList()
            emit(Result.Success(teams)) // ⬅️ Emit success with data
        } catch (e: Exception) {
            emit(Result.Error(e)) // ⬅️ Emit error
        }
    }.flowOn(Dispatchers.IO) // ⬅️ Make sure it's on IO thread
}
