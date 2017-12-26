package com.rnd.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.CorrectionInfo;
import android.widget.FrameLayout;

/**
 * Created by shailendra.chotalia on 26/12/2017.
 */
public class FloatingButtonActivity extends AppCompatActivity {

    //Used Coordinator layout to overcome Snackback hiding FAB issue and to enable swap to remove snack bar.
    CoordinatorLayout rootLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floating_button);

        rootLayout = (CoordinatorLayout) findViewById(R.id.rootLayout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Floating Button");

        //Inflate the menu and the click listener.
        toolbar.inflateMenu(R.menu.menu_snackbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.simple:
                        Snackbar.make(rootLayout, "Simple Snack bar", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.action:
                        Snackbar snackbar = Snackbar.make(rootLayout, "Snack bar with action", Snackbar.LENGTH_LONG);
                        snackbar.setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar.make(rootLayout, "UNDO done sucessfully", Snackbar.LENGTH_LONG).show();
                            }
                        });
                        snackbar.show();
                        break;
                }
                return true;
            }
        });

        FloatingActionButton floatingActionButton = (FloatingActionButton)findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(rootLayout, "Snack bar message", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
