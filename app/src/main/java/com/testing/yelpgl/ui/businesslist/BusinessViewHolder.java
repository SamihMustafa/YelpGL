package com.testing.yelpgl.ui.businesslist;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.testing.yelpgl.model.Business;

/**
 * Created by Ali on 20-Aug-17.
 */

public class BusinessViewHolder extends RecyclerView.ViewHolder {

    private final ViewDataBinding binding;
    private final boolean twoPane;


    public BusinessViewHolder(ViewDataBinding binding, boolean twoPane) {
        super(binding.getRoot());
        this.binding = binding;
        this.twoPane = twoPane;
    }

    public void bind(Business business){

    }
}
