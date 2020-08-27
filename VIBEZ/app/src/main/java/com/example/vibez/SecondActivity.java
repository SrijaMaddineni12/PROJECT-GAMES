package com.example.vibez;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView tv_level, tv_number;

    EditText et_number;

    Button b_confirm;
    Random r ;
    int currentLevel = 1;
    String generatedNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_level = findViewById(R.id.tv_level);
        tv_number = findViewById(R.id.tv_number);

        et_number = findViewById(R.id.et_number);
        b_confirm = findViewById(R.id.b_confirm);
        r = new Random();

        //hide the input and the button and show the number
        et_number.setVisibility(View.GONE);
        b_confirm.setVisibility(View.GONE);
        tv_number.setVisibility(View.VISIBLE);

        //display the current level
        tv_level.setText("Level: " + currentLevel);

        //display random number according to the level
        generatedNumber = generateNumber(currentLevel);
        tv_number.setText(generatedNumber);
        //display the elements after 2 seconds and hide the number
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                et_number.setVisibility(View.VISIBLE);
                b_confirm.setVisibility(View.VISIBLE);
                tv_number.setVisibility(View.GONE);

                et_number.requestFocus();
            }
        },2000);

        b_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check if the number is same
                if (generatedNumber.equals(et_number.getText().toString())) {
                    //hide the input and the button and show the number
                    et_number.setVisibility(View.GONE);
                    b_confirm.setVisibility(View.GONE);
                    tv_number.setVisibility(View.VISIBLE);

                    //remove text from input
                    et_number.setText("");

                    //increase the level
                    currentLevel++;

                    //display the current level
                    tv_level.setText("Level: " + currentLevel);

                    //display random number according to the level
                    generatedNumber = generateNumber(currentLevel);
                    tv_number.setText(generatedNumber);

                    //display the elements after 2 seconds and hide the number
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            et_number.setVisibility(View.VISIBLE);
                            b_confirm.setVisibility(View.VISIBLE);
                            tv_number.setVisibility(View.GONE);

                            et_number.requestFocus();
                        }
                    },2000);
                }else{
                    tv_level.setText("Game Over ! The number was" + generatedNumber);
                    b_confirm.setEnabled(false);
                }
            }
        });
    }

    private String generateNumber(int digits) {
        String output = "";
        for (int i = 0; i<=digits; i++){
            int randomDigit = r.nextInt(10);
            output = output + "" + randomDigit;
        }
        return output;
    }
}