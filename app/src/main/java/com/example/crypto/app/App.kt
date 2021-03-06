package com.example.crypto.app

import android.app.Application
import com.example.crypto.app.module.networkModule
import com.example.crypto.app.module.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                networkModule,
                repositoryModule
            )
        }
    }

}
