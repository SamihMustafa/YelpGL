package com.testing.yelpgl.ui.businesslist;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Ali on 20-Aug-17.
 */

public class BusinessViewHolder extends RecyclerView.ViewHolder {

    private final ViewDataBinding binding;

    public BusinessViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(){

    }
}
