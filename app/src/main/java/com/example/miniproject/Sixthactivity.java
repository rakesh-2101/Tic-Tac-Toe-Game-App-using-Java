package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sixthactivity extends AppCompatActivity {

    Button button1,button2,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthactivity);

        button1=(Button)findViewById(R.id.button61);
        button2=(Button)findViewById(R.id.button62);
        button3=(Button)findViewById(R.id.button63);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Sixthactivity.this,singlemulti.class);
                startActivity(it);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sixthactivity.this,singlemulti2.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sixthactivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}