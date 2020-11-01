package com.example.gogrocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login1 extends AppCompatActivity {
Button b1;
Button b2;
Button b3;
TextView t1;
TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        b1 = (Button)findViewById(R.id.loginBtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login1.this,category.class);
                startActivity(i);
            }
        });
        b2=(Button)findViewById(R.id.button12);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login1.this,register1.class);
                startActivity(i);
            }
        });
        b3=(Button)findViewById(R.id.button11);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login1.this,Admin.class);
                startActivity(i);
            }
        });
        t1=(TextView)findViewById(R.id.createText);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login1.this,register.class);
                startActivity(i);
            }
        });
        t2=(TextView)findViewById(R.id.forgotPassword);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login1.this,recover.class);
                startActivity(i);
            }
        });
    }
}