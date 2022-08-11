package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fifthactivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtLoginUsername;
    EditText txtLoginPassword;
    Button btnLogin;

    String user,pass;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthactivity);

        txtLoginUsername=(EditText)findViewById(R.id.txt_login_username);
        txtLoginPassword=(EditText)findViewById(R.id.txt_login_password);
        btnLogin=(Button)findViewById(R.id.btn_login_signin);
        btnLogin.setOnClickListener(this);

        Bundle bundle=getIntent().getBundleExtra("data");
        user=bundle.getString("user");
        pass=bundle.getString("pass");

    }

    @Override
    public void onClick(View v) {
        String user1=txtLoginUsername.getText().toString();
        String pass1=txtLoginPassword.getText().toString();

        if(user.equals(user1)&&pass.equals(pass1))
        {
            Intent it = new Intent(this,Sixthactivity.class);
            startActivity(it);
        }

        else
        {
            count++;
            if(count==2)
            {
                btnLogin.setEnabled(false);
                Toast.makeText(this,"Failed Login Attempts"+count,Toast.LENGTH_LONG).show();
            }

            else
            {
                Toast.makeText(this,"Login Failed"+count,Toast.LENGTH_LONG).show();
            }
        }
    }
}