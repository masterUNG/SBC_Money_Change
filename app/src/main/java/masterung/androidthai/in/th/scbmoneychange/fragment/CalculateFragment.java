package masterung.androidthai.in.th.scbmoneychange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import masterung.androidthai.in.th.scbmoneychange.MainActivity;
import masterung.androidthai.in.th.scbmoneychange.R;

/**
 * Created by masterung on 13/1/2018 AD.
 */

public class CalculateFragment extends Fragment{


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Toolbar Controller
        Toolbar toolbar = getView().findViewById(R.id.toolbarCalculate);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle(getString(R.string.th_exchange));
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle(getString(R.string.th_sub_exchange));

        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });


    }   // Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_calculate, container, false);
        return view;

    }
}   // Main Class
