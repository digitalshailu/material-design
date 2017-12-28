package com.rnd.materialdesign.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rnd.materialdesign.R;

/**
 * Created by shailendra.chotalia on 27/12/2017.
 */
public class MainAnimationActivity extends AppCompatActivity {

    ImageView mMailImageView, mDoneImageView;
    TextView mSharedText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_animation);

        mMailImageView = (ImageView) findViewById(R.id.mailImageView);
        mDoneImageView = (ImageView) findViewById(R.id.doneImageView);
        mSharedText = (TextView) findViewById(R.id.sharedText);
    }

    public void openRepelEffect(View view) {
        Intent i = new Intent(this, RippleAnimationActivity.class);
        startActivity(i);
    }

    public void shareAnimation(View view) {

        //Create pair object for all item that needs to be shared.
        Pair[] pair = new Pair[3];
        pair[0] = new Pair <View , String>(mMailImageView, "shared_image_email");
        pair[1] = new Pair <View , String>(mDoneImageView, "shared_image_done");
        pair[2] = new Pair <View , String>(mSharedText, "shared_text");

        //Create ActivityOptions
        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this, pair);

        //Pass the ActivityOptions.toBundle while starting the activity.
        Intent i = new Intent(this, SharedAnimationActivity.class);
        startActivity(i, activityOptions.toBundle());
    }

    public void explodeTransitionByJava(View view) {

        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this);

        //Pass the ActivityOptions.toBundle while starting the activity.
        Intent i = new Intent(this, TransitionAnimationActivity.class);
        i.putExtra(AnimationContants.KEY_ANIM_TYPE, AnimationContants.TransitionType.ExplodeJava);
        i.putExtra(AnimationContants.KEY_TITLE, "Explode by JAVA");
        startActivity(i, activityOptions.toBundle());
    }

    public void explodeTransitionByXML(View view) {

        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this);

        //Pass the ActivityOptions.toBundle while starting the activity.
        Intent i = new Intent(this, TransitionAnimationActivity.class);
        i.putExtra(AnimationContants.KEY_ANIM_TYPE, AnimationContants.TransitionType.ExplodeXML);
        i.putExtra(AnimationContants.KEY_TITLE, "Explode by XML");
        startActivity(i, activityOptions.toBundle());
    }

    public void slideTransitionByJava(View view) {
        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this);

        //Pass the ActivityOptions.toBundle while starting the activity.
        Intent i = new Intent(this, TransitionAnimationActivity.class);
        i.putExtra(AnimationContants.KEY_ANIM_TYPE, AnimationContants.TransitionType.SlideJava);
        i.putExtra(AnimationContants.KEY_TITLE, "Slide by JAVA");
        startActivity(i, activityOptions.toBundle());
    }

    public void slideTransitionByXML(View view) {

        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this);

        //Pass the ActivityOptions.toBundle while starting the activity.
        Intent i = new Intent(this, TransitionAnimationActivity.class);
        i.putExtra(AnimationContants.KEY_ANIM_TYPE, AnimationContants.TransitionType.SlideXML);
        i.putExtra(AnimationContants.KEY_TITLE, "Slide by XML");
        startActivity(i, activityOptions.toBundle());
    }

    public void fadeTransitionByJava(View view) {
    }

    public void fadeTransitionByXML(View view) {
    }
}
