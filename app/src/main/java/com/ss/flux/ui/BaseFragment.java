package com.ss.flux.ui;

import android.app.Activity;
import android.app.Fragment;
import android.support.annotation.NonNull;

import com.ss.flux.internal.di.component.FragmentComponent;
import com.ss.flux.internal.di.module.FragmentModule;

public abstract class BaseFragment extends Fragment {

    private FragmentComponent fragmentComponent;

    @NonNull
    public FragmentComponent getComponent() {
        if (fragmentComponent != null) {
            return fragmentComponent;
        }

        Activity activity = getActivity();
        if (activity instanceof BaseActivity) {
            fragmentComponent = ((BaseActivity) activity).getComponent().plus(new FragmentModule(this));
            return fragmentComponent;
        } else {
            throw new IllegalArgumentException(
                    "The activity of this fragment is not an instance of BaseActivity"
            );
        }
    }
}
