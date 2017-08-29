package com.testing.yelpgl.ui;

import android.app.Application;

import com.testing.yelpgl.dagger.AppModule;
import com.testing.yelpgl.dagger.DaggerNetComponent;
import com.testing.yelpgl.dagger.NetComponent;
import com.testing.yelpgl.dagger.NetworkModule;
/**
 * Created by Samih on 28-Aug-17.
 */

public class YelpApplication extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule("https://api.yelp.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
