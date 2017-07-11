package com.ss.flux.internal.di.component;

import com.ss.flux.internal.di.module.ActivityModule;
import com.ss.flux.internal.di.module.FragmentModule;
import com.ss.flux.internal.di.scope.ActivityScope;
import com.ss.flux.ui.BaseActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(BaseActivity activity);

    FragmentComponent plus(FragmentModule module);
}
