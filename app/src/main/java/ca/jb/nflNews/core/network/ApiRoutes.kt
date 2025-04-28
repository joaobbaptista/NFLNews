package ca.jb.nflNews.core.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

object ApiRoutes {

    private const val BASE_URL_ESPN = "https://site.api.espn.com/apis/site/v2/sports/football/"

    object Teams {
        fun getTeams() = "$BASE_URL_ESPN/nfl/teams"
    }
//
//    object Post {
//        fun getPosts(userId: String) = "$BASE_URL_ESPN/users/$userId/posts"
//    }

}

suspend inline fun <reified T> HttpClient.safeGet(url: String): T {
    return this.get(url).body()
}

inline fun <T> safeFlow(crossinline block: suspend () -> T): Flow<Result<T>> = flow {
    emit(Result.Loading)
    try {
        emit(Result.Success(block()))
    } catch (e: Exception) {
        emit(Result.Error(e))
    }
}.flowOn(Dispatchers.IO)


sealed class Result<out T> {
    object Loading : Result<Nothing>()
    data class Success<T>(val data: T) : Result<T>()
    data class Error(val exception: Throwable) : Result<Nothing>()
}

//suspend fun getUser(id: String): User {
//    return client.safeGet(ApiRoutes.User.getUser(id))
//}