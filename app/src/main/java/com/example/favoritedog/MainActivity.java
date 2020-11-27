package com.example.favoritedog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton tv;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (ImageButton) findViewById(R.id.imageButton);

        registerForContextMenu(tv);
    }
    public RotateAnimation myRotateAnim(View view){

        RotateAnimation animation = new RotateAnimation(-30, 60, 180, 180);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.RESTART);
        animation.setInterpolator(new LinearInterpolator());
        animation.setDuration(500L);

        view.startAnimation(animation);

        return animation;

    }

    public void onCorgiClick(View view){
        TextView breed = (TextView) findViewById(R.id.breed);

        myRotateAnim(view);
        anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.startAnimation(anim);

        breed.setText("Корги");
    }
    public void onHaskiClick(View view){
        TextView breed = (TextView) findViewById(R.id.breed);

        myRotateAnim(view);

        anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
        TextView t3 = (TextView) findViewById(R.id.textView5);
        t3.startAnimation(anim);

        breed.setText("Хаски");
    }
    public void onDolmatinexClick(View view){
        TextView breed = (TextView) findViewById(R.id.breed);

        anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.startAnimation(anim);


        myRotateAnim(view);

        breed.setText("Долматинец");
    }
    public void onBoxerClick(View view){
        TextView breed = (TextView) findViewById(R.id.breed);

        anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
        TextView t5 = (TextView) findViewById(R.id.textView3);
        t5.startAnimation(anim);

        myRotateAnim(view);

        breed.setText("Боксер");
    }
}