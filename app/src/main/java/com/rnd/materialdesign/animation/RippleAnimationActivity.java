package com.rnd.materialdesign.animation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rnd.materialdesign.R;

/**
 * Created by shailendra.chotalia on 27/12/2017.
 */
public class RippleAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_animation);

        //getSupportActionBar().setTitle("Ripple Animations");
    }

    public void openRepelEffect(View view) {

    }

    public void performRepelEffect(View view) {
    }
}
