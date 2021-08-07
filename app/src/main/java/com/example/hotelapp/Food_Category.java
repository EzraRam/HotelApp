package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Food_Category extends AppCompatActivity {
Button ContactUs,btnbagu,btnoxfor,btnoxford;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_food__category);
       TextView kk = findViewById(R.id.yy);

        ContactUs=findViewById(R.id.ContactUs);
        ContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Food_Category.this,Mailing.class));
            }
        });
        btnbagu=findViewById(R.id.btnbagu);
        btnbagu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Food_Category.this,Shopping_cart.class));
            }
        });
        btnoxfor=findViewById(R.id.btnoxfor);
        btnoxfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Food_Category.this,Shopping_cart.class));
            }
        });
        btnoxford=findViewById(R.id.btnoxford);
        btnoxford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Food_Category.this,Shopping_cart.class));
            }
        });




        // xx.setText("Food_Category");

        //    TextView cc=findViewById(R.id.yy);
        //   TextView bb=findViewById(R.id.mm);
         //  View.OnClickListener(new View.OnClickListener(){
        // public void onClick(View V) {
       //  startActivity(new Intent(Food_Category.this, HotelRegister.class));


       //  startActivity(new Intent(fo.this,Food_Category.class)
       //  .putExtra("yy",kk.getText().toString();}}





        }}






