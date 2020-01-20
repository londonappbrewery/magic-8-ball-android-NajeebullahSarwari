package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button askbutton;
        askbutton= findViewById(R.id.askButton);
       final ImageView ballImg=findViewById(R.id.ballImage);
        final int[] ballArray=new int[]{R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8 ball" ,"the button has pressed");
               Random randomgenerator=new Random();
               int number=randomgenerator.nextInt(5);
               Log.d("8 ball","the number is "+number);

               ballimg.setImageResource(ballArray[number]);


            }
        });


    }

}
