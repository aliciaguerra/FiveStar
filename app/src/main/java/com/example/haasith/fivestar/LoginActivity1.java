package com.example.haasith.fivestar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LoginActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
    }

    public void sidepic(View view) {
        Intent startNewActivity = new Intent(this, SingleCamera.class);
        startActivity(startNewActivity);
    }
    public void frontandrearpic(View view) {
        Intent startNewActivity = new Intent(this, FivePointCamera2.class);
        startActivity(startNewActivity);
    }

}
