package com.rnd.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by shailendra.chotalia on 26/12/2017.
 */
public class StandAloneToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Standard Toolbar");
        toolbar.setSubtitle("sub title");
        toolbar.setNavigationIcon(R.drawable.ic_launcher);
    }
}
