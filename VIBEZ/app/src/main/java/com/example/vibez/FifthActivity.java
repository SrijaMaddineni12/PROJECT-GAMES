package com.example.vibez;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity {
    private TextView tv_info;

    private Button b_yes, b_higher, b_lower, b_ok;

    private int tries = 0;

    private int left = 1, right = 1000;
    private int mid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        tv_info = (TextView) findViewById(R.id.tv_info);

        b_ok = (Button) findViewById(R.id.b_ok);
        b_higher = (Button) findViewById(R.id.b_higher);
        b_lower = (Button) findViewById(R.id.b_lower);
        b_yes = (Button) findViewById(R.id.b_yes);

        b_yes.setVisibility(View.INVISIBLE);
        b_higher.setVisibility(View.INVISIBLE);
        b_lower.setVisibility(View.INVISIBLE);

        tv_info.setText("Think of a number between 1 and 1000 and I will guess it under 10 moves.");

        b_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b_yes.setVisibility(View.VISIBLE);
                b_higher.setVisibility(View.VISIBLE);
                b_lower.setVisibility(View.VISIBLE);
                b_ok.setVisibility(View.INVISIBLE);

                guess();
            }
        });
        b_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_info.setText("WOW! I guessed in " + tries + "moves, Awesome!");

                b_yes.setVisibility(View.INVISIBLE);
                b_higher.setVisibility(View.INVISIBLE);
                b_lower.setVisibility(View.INVISIBLE);
                b_ok.setVisibility(View.VISIBLE);

                b_ok.setText("NEW GAME");

                tries = 0;
                left = 1;
                right = 1000;
            }
        });
        b_higher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                left = mid + 1;
                guess();

            }
        });
        b_lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right = mid - 1;
                guess();
            }
        });
    }
    private void  guess() {
        mid = (left + right) / 2;
        tries++;
        tv_info.setText("My guess is" + mid);
    }
}