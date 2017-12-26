package com.rnd.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

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


        //Inflate the menu and the click listener.
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.save:
                        break;
                    case R.id.refresh:
                        break;
                }
                return true;
            }
        });

    }
}
