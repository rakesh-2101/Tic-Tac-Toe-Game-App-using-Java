package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class singlemulti extends AppCompatActivity  {

    Button btn1,btn2,btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlemulti);

        btn1 = (Button)findViewById(R.id.button);


        btn2 = (Button)findViewById(R.id.button5);


        btn3 = (Button)findViewById(R.id.button6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(singlemulti.this,Seventhactivity.class);
                startActivity(it);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(singlemulti.this,Secondactivity.class);
                startActivity(it);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(singlemulti.this,Sixthactivity.class);
                startActivity(it);
            }
        });
    }

}