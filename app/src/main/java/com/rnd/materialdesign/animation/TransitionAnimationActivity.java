package com.rnd.materialdesign.animation;

import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.AnticipateInterpolator;

import com.rnd.materialdesign.R;

/**
 * Created by shailendra.chotalia on 27/12/2017.
 */
public class TransitionAnimationActivity extends AppCompatActivity {

    AnimationContants.TransitionType type;
    String toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //      getWindow must be called before calling onCreate() and setContentView()
//      The same can be achieved with declaring it in styles.xml
//      <item name="android:windowContentTransitions">true</item>
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_animation);

        initPage();

        initAnimation();
    }

    private void initAnimation() {

        switch (type){

            case ExplodeJava:
                Explode explode = new Explode();
                explode.setDuration(1000);
                getWindow().setEnterTransition(explode);
                break;
            case ExplodeXML:
                Transition enterTransition = TransitionInflater.from(this).inflateTransition(R.transition.explode);
                getWindow().setEnterTransition(enterTransition);
                break;
            case SlideJava:
                Slide slide = new Slide();
                slide.setDuration(1000);
                slide.setSlideEdge(Gravity.BOTTOM);
                //In previous commit, Interpolator was set by XML,
                //Setting interpolator by code.
                slide.setInterpolator(new AnticipateInterpolator());
                getWindow().setEnterTransition(slide);
                break;
            case SlideXML:
                Transition slideTransition = TransitionInflater.from(this).inflateTransition(R.transition.slide);
                getWindow().setEnterTransition(slideTransition);
                break;
            case FadeJava:
                break;
            case FadeXML:
                break;
        }

    }

    private void initPage() {
        type = (AnimationContants.TransitionType)getIntent().getSerializableExtra(AnimationContants.KEY_ANIM_TYPE);
        toolbarTitle = getIntent().getExtras().getString(AnimationContants.KEY_TITLE);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(toolbarTitle);
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
