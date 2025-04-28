package ca.jb.nflNews.core.di

import ca.jb.nflNews.core.network.ApiRoutes
import ca.jb.nflNews.core.network.httpClientAndroid
import io.ktor.client.HttpClient
import org.koin.dsl.module


val networkModule = module {
    single { ApiRoutes }
    single { provideHttpClient() }
}

fun provideHttpClient(): HttpClient {
    return httpClientAndroid
}
