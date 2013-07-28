package com.codebybrian.polygons;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View poly1 = findViewById(R.id.poly1);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.clockwise_rotate);
        rotate.setRepeatCount(Animation.INFINITE);
        rotate.setRepeatMode(Animation.RESTART);
//        poly1.startAnimation(rotate);

//        View poly2 = findViewById(R.id.poly2);
//        Animation rotate2 = AnimationUtils.loadAnimation(this, R.anim.counterclockwise_rotate);
//        rotate2.setDuration(1000);
//        rotate2.setRepeatCount(Animation.INFINITE);
//        rotate2.setRepeatMode(Animation.RESTART);
//        poly2.startAnimation(rotate2);
//
//        View poly4 = findViewById(R.id.poly4);
//        Animation rotate4 = AnimationUtils.loadAnimation(this, R.anim.scale_up);
//        rotate4.setDuration(1000);
//        rotate4.setRepeatCount(Animation.INFINITE);
//        rotate4.setRepeatMode(Animation.REVERSE);
//        poly4.startAnimation(rotate4);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
