package com.testing.yelpgl.ui.businesslist;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.testing.yelpgl.R;

import com.testing.yelpgl.databinding.ActivityBusinessListBinding;
import com.testing.yelpgl.ui.businessdetail.BusinessDetailActivity;

/**
 * An activity representing a list of Businesses. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link BusinessDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class BusinessListActivity extends AppCompatActivity {

    private static final String TAG = BusinessListActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBusinessListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_business_list);

        BusinessListFragment bsListFragment;
        if(savedInstanceState == null) {
            bsListFragment = new BusinessListFragment();
        } else {
            bsListFragment = (BusinessListFragment) this.getFragmentManager().findFragmentByTag(TAG);
        }

        this.getFragmentManager().beginTransaction().add(binding.businessListFramelayout.getId(), bsListFragment, TAG).commit();

    }


}
