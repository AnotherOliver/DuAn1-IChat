package com.anthonycode.animation_provided.Common.SpalshScreen.User.Register;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.anthonycode.animation_provided.Home;
import com.anthonycode.animation_provided.R;

public class fragment4 extends Fragment {
    private static final String TAG = "Fragment_4";
    Button btnCtn;
    EditText edtNewPass, edtConfirmPass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment4, container, false);

        //animation
//        Animation animationButton = AnimationUtils.loadAnimation(getActivity(), R.anim.slide);
//        view.setAnimation(animationButton);

        //innit view
        btnCtn = view.findViewById(R.id.btn_ctn4);
        edtNewPass = view.findViewById(R.id.txtNewPass);
        edtConfirmPass = view.findViewById(R.id.txtConfirmPass);

        btnCtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Home.class));
            }
        });

        return view;
    }

}