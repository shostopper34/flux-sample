package com.ss.flux.internal.di.component;

import com.ss.flux.App;
import com.ss.flux.internal.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);
}
