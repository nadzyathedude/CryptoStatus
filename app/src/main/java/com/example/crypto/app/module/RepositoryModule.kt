package com.example.crypto.app.module

import com.example.crypto.data.repository.CryptoRepositoryImpl
import com.example.crypto.domain.intercator.CryptoInteractor
import com.example.crypto.domain.intercator.CryptoInteractorImpl
import com.example.crypto.domain.repository.CryptoRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<CryptoInteractor> { CryptoInteractorImpl(get()) }
    single<CryptoRepository> { CryptoRepositoryImpl(get()) }
}
