package com.anthonycode.animation_provided.Common.SpalshScreen.OnBroading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.anthonycode.animation_provided.Adapter.SliderAdapter;
import com.anthonycode.animation_provided.R;
import com.anthonycode.animation_provided.Common.SpalshScreen.Content_Fragment;

public class OnBroadingActivity extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout dotsLayout;
    SliderAdapter sliderAdapter;
    TextView[] dots;
    Button btn_getStarted;
    Animation animation;
    int currentPosition;
    SharedPreferences onBroadingScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_broading);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(Color.WHITE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Hooks
        viewPager = findViewById(R.id.slider);
        dotsLayout = findViewById(R.id.dotsLayout);
        btn_getStarted = findViewById(R.id.btn_get_started);



        //Adapter
        sliderAdapter = new SliderAdapter(this);

        //set Adapter
        viewPager.setAdapter(sliderAdapter);

        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);
    }

    public void skip(View view) {
        startActivity(new Intent(this, Content_Fragment.class));
        finish();
    }

    public void next(View view) {
        viewPager.setCurrentItem(currentPosition + 1);
    }

    private void addDots(int position) {
        dots = new TextView[4];
        dotsLayout.removeAllViews();

        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);

            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0) {
            dots[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
            currentPosition = position;

            if (position == 0) {
                btn_getStarted.setVisibility(View.INVISIBLE);
            } else if (position == 1) {
                btn_getStarted.setVisibility(View.INVISIBLE);
            } else if (position == 2) {
                btn_getStarted.setVisibility(View.INVISIBLE);
            } else {
                animation = AnimationUtils.loadAnimation(OnBroadingActivity.this, R.anim.bottom_anim);
                btn_getStarted.setAnimation(animation);
                btn_getStarted.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    public void started(View view) {
        startActivity(new Intent(this, Content_Fragment.class));
//        savePrefsData();
        finish();
    }



    private void savePrefsData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isOnlyOne_OnBroading", true);
        editor.commit();

    }
}