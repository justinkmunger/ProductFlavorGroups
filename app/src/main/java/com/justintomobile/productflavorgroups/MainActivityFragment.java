package com.justintomobile.productflavorgroups;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.justintomobile.productflavorgroups.brand.Brand;
import com.justintomobile.productflavorgroups.cost.Cost;
import com.justintomobile.productflavorgroups.environment.Environment;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private TextView mBrandTextView;
    private TextView mCostTextView;
    private TextView mEnvironmentTextView;
    private TextView mBuildTypeTextView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBrandTextView = (TextView)view.findViewById(R.id.main_brand);
        mCostTextView = (TextView)view.findViewById(R.id.main_cost);
        mEnvironmentTextView = (TextView)view.findViewById(R.id.main_environment);
        mBuildTypeTextView = (TextView)view.findViewById(R.id.main_buildtype);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mBrandTextView.setText(Brand.BRAND_NAME);
        mCostTextView.setText(Cost.COST_NAME);
        mEnvironmentTextView.setText(Environment.ENVIRONMENT_NAME);
        mBuildTypeTextView.setText(BuildConfig.DEBUG ? "Debug" : "Release");
    }
}
