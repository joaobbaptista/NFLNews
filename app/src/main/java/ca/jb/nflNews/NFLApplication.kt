package ca.jb.nflNews

import android.app.Application
import ca.jb.nflNews.core.di.networkModule
import ca.jb.nflNews.core.di.repositoryModule
import ca.jb.nflNews.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class NFLApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@NFLApplication)
            modules(
                viewModelModule,
                repositoryModule,
                networkModule
            )
        }
    }
}