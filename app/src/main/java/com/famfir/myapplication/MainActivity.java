package com.famfir.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.javiersantos.appupdater.AppUpdater;
import com.github.javiersantos.appupdater.enums.Display;
import com.github.javiersantos.appupdater.enums.UpdateFrom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AppUpdater(this)
                .setUpdateFrom(UpdateFrom.GOOGLE_PLAY)
                .setUpdateFrom(UpdateFrom.JSON)
                .setUpdateJSON("https://github.com/famfir18/AppUpdater/blob/master/app/update.json")
                .setDisplay(Display.DIALOG)
                .setTitleOnUpdateAvailable("Update available")
                .setContentOnUpdateAvailable("Update aplikasi untuk menggunakan aplikasi")
                .setButtonUpdate("Update")
                .setCancelable(false)
                .start();
    }
}