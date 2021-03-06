package com.testing.yelpgl.ui.businesslist;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.testing.yelpgl.R;
import com.testing.yelpgl.model.Business;

import java.util.List;

/**
 * Created by Ali on 20-Aug-17.
 */

public class BusinessAdapterList extends RecyclerView.Adapter<BusinessViewHolder> {

    private final boolean twoPane;
    public List<Business> businessList;

    public BusinessAdapterList(boolean mTwoPane) {
        this.twoPane = mTwoPane;
    }


    @Override
    public BusinessViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.business_list_content, parent, false);
        return new BusinessViewHolder(binding, twoPane);
    }

    @Override
    public void onBindViewHolder(BusinessViewHolder holder, int position) {
        holder.bind(businessList.get(position));
    }


    @Override
    public int getItemCount() {
        return businessList.size();
    }

  /*


    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText(mValues.get(position).content);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTwoPane) {
                    Bundle arguments = new Bundle();
                    arguments.putString(BusinessDetailFragment.ARG_ITEM_ID, holder.mItem.id);
                    BusinessDetailFragment fragment = new BusinessDetailFragment();
                    fragment.setArguments(arguments);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.business_detail_container, fragment)
                            .commit();
                } else {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, BusinessDetailActivity.class);
                    intent.putExtra(BusinessDetailFragment.ARG_ITEM_ID, holder.mItem.id);

                    context.startActivity(intent);
                }
            }
        });
    } */
}
