package com.anthonycode.animation_provided.Common.SpalshScreen.User;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.transition.Fade;
import android.widget.TextView;

import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import com.anthonycode.animation_provided.Common.SpalshScreen.Content_Fragment;
import com.anthonycode.animation_provided.Common.SpalshScreen.User.ForgotPassword.ForgotPasswordActivity;
import com.anthonycode.animation_provided.R;

public class LoginActivity extends Activity {
    ImageView img2;
    EditText edtNewPass, edtConfirmPass;
    TextView tvForgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //hooks
        img2 = findViewById(R.id.img2);
        edtNewPass = findViewById(R.id.txtNewPass);
        edtConfirmPass = findViewById(R.id.txtConfirmPass);
        tvForgotPass = findViewById(R.id.txtConfirmPass);

        //overridePendingTransition(R.anim.anim_fadein, R.anim.anim_fadeout);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

    }

    public void forgotPassword(View view) {
        Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        ActivityOptionsCompat optionsCompat =
                ActivityOptionsCompat.makeSceneTransitionAnimation(LoginActivity.this, img2, ViewCompat.getTransitionName(img2));

        startActivity(intent, optionsCompat.toBundle());
        //animation when click open LoginActivity
        //overridePendingTransition(R.anim.anim_fadein, R.anim.anim_fadeout);
    }

}