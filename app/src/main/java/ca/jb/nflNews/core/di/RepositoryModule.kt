package ca.jb.nflNews.core.di

import ca.jb.nflNews.data.teams.TeamsRepositoryImpl
import ca.jb.nflNews.domain.teams.TeamsRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
//    single { provideRemoteRepository(get()) }
    singleOf(::TeamsRepositoryImpl) { bind<TeamsRepository>() }
}

//fun provideRemoteRepository(apiService: ApiService): RemoteRepositoryImpl {
//    return RemoteRepositoryImpl(apiService)
//}

