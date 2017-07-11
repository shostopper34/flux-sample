package com.ss.flux.data.repository;

import com.ss.flux.data.api.QiitaService;
import com.ss.flux.internal.di.scope.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @AppScope
    QiitaRepository provideQiitaRepository(QiitaService qiitaService) {
        return new QiitaRepository(qiitaService);
    }
}
