package com.example.vibez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button b1, b2, b3, b4, b5, b6, b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text);
        b1 = findViewById(R.id.memorygame);
        b2 = findViewById(R.id.shutthebox);
        b3 = findViewById(R.id.repeatgame);
        b4 = findViewById(R.id.mindreadergame);
        b5 = findViewById(R.id.rockpaper);
        b6 = findViewById(R.id.tappinggame);
        b7 = findViewById(R.id.tictactoe);
    }

    public void memorygame(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }

    public void anagramgame(View view) {
        Intent i = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(i);
    }

    public void repeatgame(View view) {
        Intent i = new Intent(MainActivity.this, FourthActivity.class);
        startActivity(i);
    }

    public void mindreadergame(View view) {
        Intent i = new Intent(MainActivity.this, FifthActivity.class);
        startActivity(i);
    }

    public void rockpaper(View view) {
        Intent i = new Intent(MainActivity.this, SixthActivity.class);
        startActivity(i);
    }

    public void tappinggame(View view) {
        Intent i = new Intent(MainActivity.this, SeventhActivity.class);
        startActivity(i);
    }

    public void tictactoe(View view) {
        Intent i = new Intent(MainActivity.this, EighthActivity.class);
        startActivity(i);
    }
}