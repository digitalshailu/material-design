package com.rnd.materialdesign;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
}
