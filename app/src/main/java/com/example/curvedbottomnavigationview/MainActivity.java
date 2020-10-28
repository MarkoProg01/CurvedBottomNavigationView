package com.example.curvedbottomnavigationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class MainActivity extends AppCompatActivity {
    MeowBottomNavigation navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.bottom_nav);

        navigation.add(new MeowBottomNavigation.Model(1,R.drawable.favourite));
        navigation.add(new MeowBottomNavigation.Model(2,R.drawable.home));
        navigation.add(new MeowBottomNavigation.Model(3,R.drawable.music));
        




    }
}