package com.anthonycode.animation_provided.Common.SpalshScreen.User.Register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.anthonycode.animation_provided.R;

public class fragment3 extends Fragment {
    private static final String TAG = "Fragment_3";
    Spinner spinnerCountries;
    Button btnCtn3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment3, container, false);

        //animation
//        Animation animationButton = AnimationUtils.loadAnimation(getActivity(), R.anim.slide);
//        view.setAnimation(animationButton);

        //innit view
        spinnerCountries = view.findViewById(R.id.simpleSpinner);
        btnCtn3 = view.findViewById(R.id.btn_ctn3);

        btnCtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment4 nextFrag = new fragment4();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.anim_in_right, R.anim.anim_out_right, R.anim.anim_in_left, R.anim.anim_out_left)
                        .replace(R.id.fr_layout_content, nextFrag, TAG)
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }


}