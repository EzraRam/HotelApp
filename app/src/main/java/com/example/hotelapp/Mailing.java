package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mailing extends AppCompatActivity {

    private EditText mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;
    private Button button_call,video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mailing);
        mEditTextTo = findViewById(R.id.edit_text_to);
        mEditTextSubject = findViewById(R.id.edit_text_subject);
        mEditTextMessage = findViewById(R.id.edit_text_message);

        Button button_send = findViewById(R.id.button_send);
        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendmail();
            }
        });
        button_call=findViewById(R.id.button_call);
        button_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mailing.this,phoneCall.class));
            }
        });
        video=findViewById(R.id.ymt);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(Mailing.this,storage_media.class));
            }
        });

    }




private void sendmail(){

    String recipientlist=mEditTextTo.getText().toString();
     String[] recipients=recipientlist.split(",");
    String subject= mEditTextSubject.getText().toString();
    String message= mEditTextMessage.getText().toString();
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.putExtra(Intent.EXTRA_EMAIL,recipients);
    intent.putExtra(Intent.EXTRA_SUBJECT,subject);
    intent.putExtra(Intent.EXTRA_TEXT,message);
 intent.setType("message/rfc822");
    startActivity(Intent.createChooser(intent,"Select Email Client"));
}}