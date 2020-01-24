package com.mountain.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view) {
        ImageView up = findViewById(R.id.up);
        ImageView up2 = findViewById(R.id.up2);

        if (up.getAlpha() == 1) {

            up.animate().alpha(0f).setDuration(2000);
//            up2.setVisibility(View.VISIBLE);

            up2.animate().alpha(1f).setDuration(2000);
            up2.animate().rotation(1800f).setDuration(4000);
//        up.setVisibility(View.INVISIBLE);
        }
        if (up2.getAlpha() == 1){

            up2.animate().alpha(0f).setDuration(2000);
            up.animate().alpha(1f).setDuration(2000);

            up.animate().rotation(1800f).setDuration(4000);
        }



    }

    public void movePic(View view){
        ImageView currency = findViewById(R.id.currency);

        currency.animate().translationYBy(100f).setDuration(2000);
//        currency.animate().translationZ(500f).setDuration(2000);
//        currency.animate().translationXBy(100f).setDuration(2000);
    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView currency = findViewById(R.id.currency);

        currency.animate().translationY(-100);
    }
}
