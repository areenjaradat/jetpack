package com.example.jetpack;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

public class MainActivityObserver implements DefaultLifecycleObserver {
    private String TAG =this.getClass().getSimpleName();

    @Override
    public void onCreate( @NonNull LifecycleOwner owner ) {
        Log.i(TAG,"Observer ON_CREATE");
    }

    @Override
    public void onStart( @NonNull LifecycleOwner owner ) {
        Log.i(TAG,"Observer ON_START");
    }

    @Override
    public void onResume( @NonNull LifecycleOwner owner ) {
        Log.i(TAG,"Observer ON_RESUME");
    }

    @Override
    public void onPause( @NonNull LifecycleOwner owner ) {
        Log.i(TAG,"Observer ON_PAUSE");
    }

    @Override
    public void onDestroy( @NonNull LifecycleOwner owner ) {
        Log.i(TAG,"Observer ON_DESTROY");
    }

//    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
//    public void onCreateEvent(){
//        Log.i(TAG,"Observer ON_CREATE");
//    }
//    @OnLifecycleEvent(Lifecycle.Event.ON_START)
//    public void onStartEvent(){
//        Log.i(TAG,"Observer ON_START");
//    }
//    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
//    public void onResumeEvent(){
//        Log.i(TAG,"Observer ON_RESUME");
//    }
//    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
//    public void onPauseEvent(){
//        Log.i(TAG,"Observer ON_PAUSE");
//    }
//    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
//    public void onDestroyEvent(){
//        Log.i(TAG,"Observer ON_DESTROY");
//    }
}
