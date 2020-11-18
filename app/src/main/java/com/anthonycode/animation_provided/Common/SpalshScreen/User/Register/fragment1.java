package com.anthonycode.animation_provided.Common.SpalshScreen.User.Register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.anthonycode.animation_provided.Adapter.SpinnerCountryAdapter;
import com.anthonycode.animation_provided.Model.Country;
import com.anthonycode.animation_provided.R;

import java.util.ArrayList;

public class fragment1 extends Fragment  {
    private static final String TAG = "Fragment_1";
    Spinner spinnerCountries;
    Button btnCtn1;
    TextView tvSignIn;
    private ArrayList<Country> mCountryList;
    private SpinnerCountryAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment1, container, false);

        //animation
//        Animation animationButton = AnimationUtils.loadAnimation(getActivity(), R.anim.slide);
//        view.setAnimation(animationButton);

        //innit view
        spinnerCountries = view.findViewById(R.id.simpleSpinner);
        btnCtn1 = view.findViewById(R.id.btn_ctn1);

        initList();
        mAdapter = new SpinnerCountryAdapter(getActivity(), mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Country clickedItem = (Country) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getCodeCountry();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        btnCtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment2 nextFrag = new fragment2();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.anim_in_right, R.anim.anim_out_right, R.anim.anim_in_left, R.anim.anim_out_left)
                        .replace(R.id.fr_layout_content, nextFrag, TAG)
                        .addToBackStack(null)
                        .commit();

            }
        });



        return view;
    }

    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new Country("USA", R.drawable.ic_usa_flag, "+1"));
        mCountryList.add(new Country("Viet Nam", R.drawable.ic_vietnam_flag, "+84"));
        mCountryList.add(new Country("Japan", R.drawable.ic_japan_flag, "+81"));
    }


}