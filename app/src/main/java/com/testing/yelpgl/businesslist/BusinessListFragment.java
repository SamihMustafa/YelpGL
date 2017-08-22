package com.testing.yelpgl.businesslist;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testing.yelpgl.R;
import com.testing.yelpgl.databinding.FragmentBusinessListBinding;

/**
 * Created by Ali on 21-Aug-17.
 */

public class BusinessListFragment extends Fragment implements BusinessListContract.View{

    private Toolbar toolbar;
    private RecyclerView recyclerView;

    /**
     * Whether or not the fragment is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean twoPane;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        FragmentBusinessListBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_business_list, container, false);

        toolbar = binding.businessListToolbar;
        recyclerView = binding.businessListIncluded.businessListRecycler;

        assert recyclerView != null;

        if (binding.businessListIncluded.businessDetailContainer != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            twoPane = true;
        }
        setupRecyclerView(recyclerView, twoPane);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView, boolean mTwoPane) {
        recyclerView.setAdapter(new BusinessAdapterList(mTwoPane));
    }
}
