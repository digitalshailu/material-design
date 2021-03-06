package com.rnd.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rnd.materialdesign.animation.MainAnimationActivity;
import com.rnd.materialdesign.coordinator.CoordinatorAppbarActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openStandAloneToolbar(View view) {
        Intent i = new Intent(this, StandAloneToolbar.class);
        startActivity(i);
    }

    public void openActionbarToolbar(View view) {
        Intent i = new Intent(this, ActionBarToolbar.class);
        startActivity(i);
    }

    public void openContextualMenu(View view) {
        Intent i = new Intent(this, ContextualMenu.class);
        startActivity(i);
    }

    public void openSnackBar(View view) {
        Intent i = new Intent(this, SnackBarActivity.class);
        startActivity(i);
    }

    public void openFloatingButton(View view) {
        Intent i = new Intent(this, FloatingButtonActivity.class);
        startActivity(i);
    }

    public void openAnimationButton(View view) {
        Intent i = new Intent(this, MainAnimationActivity.class);
        startActivity(i);
    }

    public void openFloatingLableTextInputLayout(View view) {
        Intent i = new Intent(this, FloatingLabelTextInputLayoutActivity.class);
        startActivity(i);
    }

    public void openCoordinatorLayoutAppBarLayout(View view) {
        Intent i = new Intent(this, CoordinatorAppbarActivity.class);
        startActivity(i);
    }
}
