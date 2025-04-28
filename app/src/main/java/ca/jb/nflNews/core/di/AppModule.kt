package ca.jb.nflNews.core.di

import org.koin.dsl.module


val appModule = module {
    module { includes(viewModelModule, repositoryModule, networkModule) }
}

