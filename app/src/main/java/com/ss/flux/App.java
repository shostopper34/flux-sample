package com.ss.flux;

import android.app.Application;
import android.support.annotation.NonNull;

import com.ss.flux.internal.di.component.AppComponent;
import com.ss.flux.internal.di.component.DaggerAppComponent;
import com.ss.flux.internal.di.module.AppModule;

public class App extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        appComponent.inject(this);
    }

    @NonNull
    public AppComponent getComponent() {
        return appComponent;
    }
}
