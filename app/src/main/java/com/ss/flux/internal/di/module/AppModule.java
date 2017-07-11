package com.ss.flux.internal.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides objects
 * which will live during the application lifecycle.
 */
@Module
public class AppModule {

    private final Context context;

    public AppModule(Application app) {
        this.context = app;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

}
