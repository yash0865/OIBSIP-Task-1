package com.example.unitconcerter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonClicker(View view){

        if(view.getId() == R.id.temperatureButton){
            Intent intent = new Intent(MainActivity.this,Conversion.class);
            intent.putExtra("Unit","Temperature");
            startActivity(intent);
        }
        else if(view.getId() == R.id.distanceButton){
            Intent intent = new Intent(MainActivity.this,Conversion.class);
            intent.putExtra("Unit","Distance");
            startActivity(intent);
        }
        else if(view.getId() == R.id.speedButton){
            Intent intent = new Intent(MainActivity.this,Conversion.class);
            intent.putExtra("Unit","Speed");
            startActivity(intent);
        }
        else if(view.getId() == R.id.timeButton){
            Intent intent = new Intent(MainActivity.this,Conversion.class);
            intent.putExtra("Unit","Time");
            startActivity(intent);
        }
        else if(view.getId() == R.id.weightButton){
            Intent intent = new Intent(MainActivity.this,Conversion.class);
            intent.putExtra("Unit","Weight");
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Select unit", Toast.LENGTH_SHORT).show();
        }
    }
}