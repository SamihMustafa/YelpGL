package com.testing.yelpgl.network.repository;

import com.testing.yelpgl.network.WebService;

/**
 * Created by Ali on 23-Aug-17.
 */

public class YelpAuthRepository {

    private WebService webService;

    public YelpAuthRepository(WebService service){
        webService = service;
    }


    public String getAuthToken(){

        webService.getAutenticationTokenFromYelp();

    }


}
