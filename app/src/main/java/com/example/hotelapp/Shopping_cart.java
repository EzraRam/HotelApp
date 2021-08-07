package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shopping_cart extends AppCompatActivity {
    Button Shipping,sec,meal,Checkin,pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);




        Shipping=findViewById(R.id.Shipping);
        Shipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Shopping_cart.this,Shipping_Mode.class));
            }
        });
        sec=findViewById(R.id.sec);
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Shopping_cart.this,Food_Category.class));
            }
        });
        meal=findViewById(R.id.meal);
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Shopping_cart.this,Food_Category.class));
            }
        });
        Checkin=findViewById(R.id.Checkin);
        Checkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Shopping_cart.this,Hotels_In_Mbarara.class));
            }
        });
        pay=findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Shopping_cart.this,Payment.class));
            }
        });
    }
}