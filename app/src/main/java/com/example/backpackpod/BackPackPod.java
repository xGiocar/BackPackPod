package com.example.backpackpod;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends Application {
    // makes two threads, one for database/copy etc. and the other one for the app
    public static final ExecutorService IO = Executors.newFixedThreadPool(2);
    // a thread that handles all the app's actions
    public static final Handler MAIN = new Handler(Looper.getMainLooper());
    public static final String CHANNEL_DOWNLOADS = "downloads";
    @Override
    public void onCreate() {
        super.onCreate();
        NotificationChannel downloads = new NotificationChannel(CHANNEL_DOWNLOADS, getString(R.string.channel_downloads), NotificationManager.IMPORTANCE_LOW);
    }
}