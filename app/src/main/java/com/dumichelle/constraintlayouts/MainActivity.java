package com.dumichelle.constraintlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity1 (View view){
        setContentView(R.layout.layout1);
    }
    public void goToActivity2 (View view){
        setContentView(R.layout.layout2);
    }
    public void goToActivity3 (View view){
        setContentView(R.layout.layout3);
    }
    public void goToActivity4 (View view){
        setContentView(R.layout.layout4);
    }
    public void goToActivity5 (View view){
        setContentView(R.layout.layout5);
    }
    public void goToActivity6 (View view){
        setContentView(R.layout.layout6);
    }
    public void goToActivity7 (View view){
        setContentView(R.layout.layout7);
    }

    public void returnHome(View view) {
        setContentView(R.layout.activity_main);
    }
}