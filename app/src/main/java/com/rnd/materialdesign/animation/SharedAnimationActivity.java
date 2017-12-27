package com.rnd.materialdesign.animation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.rnd.materialdesign.R;

/**
 * Created by shailendra.chotalia on 27/12/2017.
 */
public class SharedAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

//      getWindow must be called before calling onCreate() and setContentView()
//      The same can be achieved with declaring it in styles.xml
//      <item name="android:windowContentTransitions">true</item>
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_animation);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Shared Element Transition");
    }

    @Override
    public boolean onSupportNavigateUp() {
        //Finish activity with Animation.
        finishAfterTransition();
        return true;
    }

    public void exit(View view) {
        //Finish activity with Animation.
        finishAfterTransition();
    }
}
