package com.testing.yelpgl.network.repository;

import com.testing.yelpgl.network.WebService;

import javax.inject.Inject;

/**
 * Created by Ali on 23-Aug-17.
 */

public class YelpAuthRepository {

    private WebService webService;
    private static final String OAUTH_GRANT = "client_credentials";

    public YelpAuthRepository(WebService service){
        webService = service;
    }


    public String getAuthToken(){

      //  webService.getAutenticationTokenFromYelp();
        return "";
    }


}
