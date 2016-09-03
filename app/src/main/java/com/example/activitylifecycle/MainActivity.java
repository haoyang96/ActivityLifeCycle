package com.example.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private static final String tag="ActivityLifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(tag,"onCreate()");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(tag,"onDestroy()");
    }

    protected void onPause(){
        super.onPause();
        Log.i(tag,"onPause()");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(tag,"onRestart()");
    }

    protected void onResume(){
        super.onResume();
        Log.i(tag,"onResume()");
    }

    protected void onStart(){
        super.onStart();
        Log.i(tag,"onStart()");
    }

    protected void onStop(){
        super.onStop();
        Log.i(tag,"onStop()");
    }

}