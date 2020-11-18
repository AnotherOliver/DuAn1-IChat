package com.anthonycode.animation_provided.Common.SpalshScreen;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import com.anthonycode.animation_provided.Common.SpalshScreen.User.LoginActivity;
import com.anthonycode.animation_provided.Common.SpalshScreen.User.Register.fragment1;
import com.anthonycode.animation_provided.R;

public class Content_Fragment extends AppCompatActivity {
    ImageView img1;
    TextView editTextTextPersonName, tvSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_fragment);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(Color.WHITE);
        img1 = findViewById(R.id.img1);
        tvSignIn = findViewById(R.id.tvSignIn);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        //start first fragment (fragment1)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fr_layout_content, new fragment1()).commit();

        }

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Content_Fragment.this, LoginActivity.class);
                ActivityOptionsCompat optionsCompat =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(Content_Fragment.this, img1, ViewCompat.getTransitionName(img1));

                startActivity(intent, optionsCompat.toBundle());
                //animation when click open LoginActivity
                //overridePendingTransition(R.anim.anim_fadein, R.anim.anim_fadeout);
            }
        });

    }

}