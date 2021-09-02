package com.example.hotelapp;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Locale;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends  AppCompatActivity {

        TextView signIn;
        TextView Click;
        TextView setpass;
    private Button b1,b2,b3,b4,b5,b6,btn,xxxx;

    private EditText QQ,ww,sign,passw,cpass,jim;


    ProgressBar ProgressBar;

    Button SignIn,reg;
    ProgressDialog ProgressDialog;
    ProgressBar progressBar;
    private ProgressDialog loadingBar;
   private FirebaseAuth firebaseAuth;
    private EditText useremail,userpass;
    private FirebaseUser CurrentUser;
    private TextView registerActivityLink;
    private EditText firstname;
    private EditText lastname;
    private EditText password;
    private EditText confpassword;
    private Button register;
    private SharedPreferences sharedPreferences;
    private String editor;
    public static final String shared_db="app_db";
    private Object SharedPreferences;
    public static final String firstname_key="firstname";
    public static final String lastname_key="lastname";
    public static final String password_key="Password";
    public static final String confirmpassword_key="confirm password";
    public static final String register_key="register";



    @Override


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            firstname=findViewById(R.id.fname);
            lastname=findViewById(R.id.lname);
            password=findViewById(R.id.passw);
            confpassword=findViewById(R.id.cpass);
            register=findViewById(R.id.reg);
            SharedPreferences=getSharedPreferences(shared_db, Context.MODE_PRIVATE);
            editor=SharedPreferences.toString();






            LoadLocale();
            setContentView(R.layout.activity_main);
            //change action bar title,if you dont change it will be according to your system defult lang
            ActionBar actionBar=getSupportActionBar();
            actionBar.setTitle(getResources().getString(R.string.app_name));

            Button changelang=findViewById(R.id.changelang);
            changelang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //show alertDialog to display list of laguages,one can be selected
                    showChangeLanguageDialog();
                }
            });



            //connecting to firebase and allowing authentications
            firebaseAuth=firebaseAuth.getInstance();
            firebaseAuth.getCurrentUser();
            registerActivityLink=(TextView) findViewById(R.id.register);

reg=findViewById(R.id.reg);
reg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,HotelRegister.class));
    }
});






            signIn=findViewById(R.id.signIn);
            signIn.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    startActivity(new Intent(MainActivity.this,Hotels_In_Mbarara.class));

                }
            });



            xxxx=findViewById(R.id.xxxx);
            xxxx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,Forgot_password.class));
                }
            });







    }
    //lets create a separet string for each laguage

    private void showChangeLanguageDialog() {

           final String[] ListItems={"French","English","Swahili"};
        AlertDialog.Builder mBuilder=new AlertDialog.Builder(MainActivity.this);
        mBuilder.setTitle("choose language....");
        mBuilder.setSingleChoiceItems(ListItems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which ) {
                if (which==0){
                    //English
                    setLocale("en");
                    recreate();
                }
               else if (which==1){
                    //french
                    setLocale("fr");
                    recreate();
                }
               else if (which==2){
                    //Belgian
                    setLocale("sw");
                    recreate();
                }

                //dismiss alerdiolog when language selected
                dialog.dismiss();

            }
        });
        AlertDialog mDialog=mBuilder.create();
        //show alert dialog
        mDialog.show();
    }

    private void setLocale(String lang) {
        Locale locale=new Locale(lang);
            Locale.setDefault(locale);
        Configuration config=new Configuration();
        config.locale=locale;
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
        //save data to shared preferences
        SharedPreferences.Editor editor=getSharedPreferences("settings",MODE_PRIVATE).edit();
        editor.putString("My_Lang",lang);
        editor.apply();
    }
    //load languages saved in shared preferences
    public void LoadLocale(){
            SharedPreferences prefs=getSharedPreferences("settings", Activity.MODE_PRIVATE);
            String language=prefs.getString("","");
            setLocale(language);

    }

    public void openRegister(View view) {
    }
}

