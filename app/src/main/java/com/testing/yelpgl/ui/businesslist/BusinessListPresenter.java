package com.testing.yelpgl.ui.businesslist;

import com.testing.yelpgl.network.WebService;

/**
 * Created by Ali on 20-Aug-17.
 */

public class BusinessListPresenter implements BusinessListContract.Presenter {


    private final WebService webService;

    public BusinessListPresenter(WebService webService) {
        this.webService = webService;

    }

    public void getListOfBusiness(){

    }
}
