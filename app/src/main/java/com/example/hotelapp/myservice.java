package com.example.hotelapp;

import android.app.Service;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class myservice  extends Service {
    private static final String TAG ="Myservice";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        CountDownTimer countDownTimer=new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.e(TAG,"onTick:"+millisUntilFinished/1000);

            }

            @Override
            public void onFinish() {
                Log.e(TAG,"onFinish:");

            }
        }.start();

        return START_STICKY;


    }
}
