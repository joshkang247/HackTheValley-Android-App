package com.example.joshk.myfirstapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void UserProfile (View view){
        Intent intent = new Intent (this, UserProfile.class);
        startActivity(intent);

//        Posts posts = new Posts();
//        FragmentManager manager = getSupportFragmentManager();
//        manager.beginTransaction().replace(R.id.content_user_profile, posts).commit();
    }




}