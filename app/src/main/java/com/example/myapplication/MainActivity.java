package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR", "onCreate()");
        button = findViewById(R.id.button);
        button.setOnClickListener(this::onClick);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR", "onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR", "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR", "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR", "onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR", "onResume()");
    }

    @Override
    public void onClick(View v) {


        switch(v.getId()) {
            case R.id.button: {

            }
        }
        if(v.getId() == R.id.button) {
            // явное намерние
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra(KEY,"Test!");
            startActivity(intent);
            // неявное намерение
           // Intent intent = new Intent(Intent.ACTION_VIEW);
           // String www = "https://mirea.ru";
          //  intent.setData(Uri.parse(www));
           // startActivity(intent);
        } else {

        }
    }
}