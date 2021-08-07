
package com.example.hotelapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.jar.Attributes;
import java.util.regex.Pattern;

public class HotelRegister extends AppCompatActivity {
    private EditText fname, lname, email, passw, cpass;
    private Button register;

    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_register);
        firebaseAuth = FirebaseAuth.getInstance();
        //initializing views
        fname=findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        email = findViewById(R.id.email);
        passw = findViewById(R.id.passw);
        cpass = findViewById(R.id.cpass);
        //register = findViewById(R.id.reg);
        progressDialog=new ProgressDialog(this);
        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });


    }

    public void register() {
        String Fname = fname.getText().toString();
        String LastName = lname.getText().toString();
        String Email = email.getText().toString();
        String password = passw.getText().toString();
        String cpassword = cpass.getText().toString();
        if (TextUtils.isEmpty(Fname)) {
            fname.setError("Field required");
            return;
        }
        else if (TextUtils.isEmpty(LastName)) {
            lname.setError("Field required");
            return;

        } else if (TextUtils.isEmpty(Email)) {
            email.setError("Field required");
            return;}
         else if (TextUtils.isEmpty(password)) {
            passw.setError("Enter your password");
            return;}


        else if (TextUtils.isEmpty(password)) {
            cpass.setError("Confirm your password");
            return;


        } else if (!password.equals(cpassword)) {
            passw.setError("Different password");
            return;


        } else if (password.length() < 4) {
            passw.setError("Password should be greater than 4 characters!!!");
            return;


        } else if (!isVallidEmail(Email)) {
            email.setError("it is invalid email");
            return;


        }
        //Displaying progressDialog
       progressDialog.setMessage("Registering please wait......");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        //creating a new user
        firebaseAuth.createUserWithEmailAndPassword(Email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(HotelRegister.this, "Successfully registered", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(HotelRegister.this, Hotels_In_Mbarara.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(HotelRegister.this, "Registration failed", Toast.LENGTH_LONG).show();

                }
                progressDialog.dismiss();

            }
        });
    }

    public Boolean isVallidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public void onclick(View v){
        register();
    }


   public void openRegister(View view) {
       startActivity(new Intent(HotelRegister.this, MainActivity.class));
    }

}