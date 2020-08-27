package com.example.vibez;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SeventhActivity extends AppCompatActivity {

    ImageView image;
    TextView Text,result;
    int currentTAPs=0;
    int bestResult=0;
    boolean gameStarted= false;
    CountDownTimer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        image=findViewById(R.id.image);
        Text=findViewById(R.id.Text1);
        result=findViewById(R.id.Text2);
        SharedPreferences preferences=getSharedPreferences("PREFS",0);
        bestResult=preferences.getInt("highScore",0);
        result.setText("Best Result:"+bestResult);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gameStarted){
                    //count the taps if its already started
                    currentTAPs++;
                }
                else{
                    //start the game if its not started
                    Text.setText("Tap,Tap,Tap......");
                    gameStarted=true;
                    timer.start();
                }
            }
        });
        timer=new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                long timeTillEnd=(l/1000)+1;
                result.setText("Time Remaining:"+ timeTillEnd);
            }
            @Override
            public void onFinish() {
                image.setEnabled(false);
                gameStarted=false;
                Text.setText("Game Over");
                if(currentTAPs>bestResult){
                    bestResult=currentTAPs;
                    SharedPreferences preferences1=getSharedPreferences("PREFS",0);
                    SharedPreferences.Editor editor=preferences1.edit();
                    editor.putInt("highScore",bestResult);
                    editor.apply();
                }
                result.setText("Best Result:"+bestResult+"\nCurrent Taps:"+currentTAPs);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        image.setEnabled(true);
                        Text.setText("Game Over");
                        currentTAPs=0;
                    }
                },2000);
            }
        };
    }
}