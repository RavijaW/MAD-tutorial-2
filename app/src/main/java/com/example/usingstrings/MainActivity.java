package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtview2 = findViewById(R.id.tvmsg2);
        txtview2.setText(R.string.Msg2);

        Log.i("Lifecycle", "Oncreate() invoked");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "onstart() invoked");
    }

   @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle", "onrestart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "onresume() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "onpause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","onStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","ondestroy() invoked");
    }
}