package com.testing.yelpgl.dagger;

import com.testing.yelpgl.network.WebService;
import com.testing.yelpgl.ui.businesslist.BusinessListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ali on 24-Aug-17.
 */

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class})
public interface NetComponent {

    void inject(BusinessListFragment fragment);

}
