package com.testing.yelpgl.ui.businessdetail;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testing.yelpgl.R;
import com.testing.yelpgl.ui.businesslist.BusinessListActivity;
import com.testing.yelpgl.model.Business;

/**
 * A fragment representing a single Business detail screen.
 * This fragment is either contained in a {@link BusinessListActivity}
 * in two-pane mode (on tablets) or a {@link BusinessDetailActivity}
 * on handsets.
 */
public class BusinessDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Business mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public BusinessDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.


            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
               // appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.business_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            //6((TextView) rootView.findViewById(R.id.business_detail)).setText(mItem.details);
        }

        return rootView;
    }
}
