package com.example.vibez;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EighthActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        turn=1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b1.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b1.setText("O");
                    }
                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b2.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b3.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b4.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b5.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b6.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b7.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b8.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")){
                    if(turn ==1) {
                        turn = 2;
                        b9.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });
    }
    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if(a.equals(b) && a.equals(c) && a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(this,"Winner is player X!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals(e) && a.equals(i) && a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(this,"Winner is player X!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals(d) && a.equals(g) && a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(this,"Winner is player X!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals(e) && b.equals(h) && b.equals("X") && e.equals("X") && h.equals("X")){
            Toast.makeText(this,"Winner is player X!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals(e) && c.equals(g) && c.equals("X") && e.equals("X") && g.equals("X")){
            Toast.makeText(this,"Winner is player X!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals(f) && c.equals(i) && c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(this,"Winner is player X!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals(e) && d.equals(f) && d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(this,"Winner is player X!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals(h) && g.equals(i) && g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(this,"Winner is player X!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals(b) && a.equals(c) && a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(this,"Winner is player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals(e) && a.equals(i) && a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(this,"Winner is player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals(d) && a.equals(g) && a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(this,"Winner is player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals(e) && b.equals(h) && b.equals("O") && e.equals("O") && h.equals("O")){
            Toast.makeText(this,"Winner is player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals(e) && c.equals(g) && c.equals("O") && e.equals("O") && g.equals("O")){
            Toast.makeText(this,"Winner is player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals(f) && c.equals(i) && c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(this,"Winner is player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals(e) && d.equals(f) && d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(this,"Winner is player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals(h) && g.equals(i) && g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(this,"Winner is player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
        if(end){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
}