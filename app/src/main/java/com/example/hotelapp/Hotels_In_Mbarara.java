package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hotels_In_Mbarara extends AppCompatActivity {
    TextView Click;
    TextView     btnagip,btnbaguma,btntriangle,btnkash,btnoxford,btnview;

    Button CheckIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels__in__mbarara);

     CheckIn=findViewById(R.id.Checkin);
     CheckIn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             startActivity(new Intent(Hotels_In_Mbarara.this,Food_Category.class));
         }
     });
        btnagip=findViewById(R.id.btnagip);
        btnagip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hotels_In_Mbarara.this,ElcoMap.class));
            }
        });
        btnbaguma=findViewById(R.id.btnbaguma);
        btnbaguma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hotels_In_Mbarara.this,ElcoMap.class));
            }
        });
        btntriangle=findViewById(R.id.btntriangle);
        btntriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hotels_In_Mbarara.this,ElcoMap.class));
            }
        });
        btntriangle=findViewById(R.id.btntriangle);
        btntriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hotels_In_Mbarara.this,ElcoMap.class));
            }
        });
        btntriangle=findViewById(R.id.btntriangle);
        btntriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hotels_In_Mbarara.this,ElcoMap.class));
            }
        });

        btnkash=findViewById(R.id.btnkash);
        btnkash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hotels_In_Mbarara.this,ElcoMap.class));
            }
        });
        btnoxford=findViewById(R.id.btnoxford);
        btnoxford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hotels_In_Mbarara.this,ElcoMap.class));
            }
        });
        btnview=findViewById(R.id.btnview);
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hotels_In_Mbarara.this,ElcoMap.class));
            }
        });






//        Click=findViewById(R.id.click);
//
//        Click.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//            public void onClick(View V) {
//                startActivity(new Intent(Hotels_In_Mbarara.this, Food_Category.class));
//            }});


       // TextView NN= findViewById(R.id.mm);
       // TextView vv=findViewById(R.id.yy);



        }


}
