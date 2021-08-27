package com.example.hotelapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseConnection  extends SQLiteOpenHelper {
    private static final String TAG="DatabaseConnection";
    public DatabaseConnection(@Nullable Context context) {
        super(context, "name.db", null, 21);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists User (id integer primary key autoincrement,email text,password text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists User");
        onCreate(db);

    }
    public void registerUser(Data data){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("email",data.getEmail());
        contentValues.put("password",data.getPassword());
        long user = sqLiteDatabase.insert("User", null, contentValues);
        if (user !=-1){
            Log.e(TAG,"registerUser :User Register successfully");
        }else {
            Log.e(TAG,"registerUser: error in registering user");
        }
    }
    public void LoginUser(Data data){
        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from User", null, null);
        while (cursor.moveToNext()){
            String email=cursor.getString(1);
            String password=cursor.getString(2);
            if (email.equals(data.getEmail())&& password.equals(data.getPassword())){
                Log.e(TAG,"LoginUser: User Login Successfully");
            }else {
                Log.e(TAG,"LoginUser:error in login");
            }
        }
    }
}
