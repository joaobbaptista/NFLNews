package ca.jb.nflNews.core.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

object ApiRoutes {

    private const val BASE_URL_ESPN = "https://site.api.espn.com/apis/site/v2/sports/football/"

//    object User {
//        fun getUser(id: String) = "$BASE_URL_ESPN/user/$id"
//    }
//
//    object Post {
//        fun getPosts(userId: String) = "$BASE_URL_ESPN/users/$userId/posts"
//    }

}

suspend inline fun <reified T> HttpClient.safeGet(url: String): T {
    return this.get(url).body()
}

//suspend fun getUser(id: String): User {
//    return client.safeGet(ApiRoutes.User.getUser(id))
//}