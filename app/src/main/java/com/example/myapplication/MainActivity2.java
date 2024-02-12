package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Toast.makeText(this,"Сообщение",Toast.LENGTH_LONG).show();
        Snackbar.make(findViewById(R.id.root),"Hello", Snackbar.LENGTH_SHORT).show();
    }
}