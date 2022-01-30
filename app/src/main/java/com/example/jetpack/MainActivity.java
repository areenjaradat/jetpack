package com.example.jetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private String TAG =this.getClass().getSimpleName();
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        Button button=findViewById(R.id.bRandom);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView mTextView = findViewById(R.id.tvNumber);
//        MainActivityDataGenerator myData = new MainActivityDataGenerator();
//        MainActivityDataGenerator model = ViewModelProviders.of(this).get(MainActivityDataGenerator.class);

        MainActivityDataGenerator model = ViewModelProviders.of(this).get(MainActivityDataGenerator.class);

        MutableLiveData<String> myRandomNumber = model.getNumber();

        myRandomNumber.observe(this , new Observer<String>() {
            @Override
            public void onChanged( String s ) {
                mTextView.setText(s);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                model.createNumber();
            }
        });



        Log.i(TAG, "Random Number Set");
    }

    @Override
    protected void onStart( ) {
        super.onStart();
        Log.i(TAG,"owner onStart");
    }

    @Override
    protected void onPause( ) {
        super.onPause();
        Log.i(TAG,"owner onPause");
    }

    @Override
    protected void onResume( ) {
        super.onResume();
        Log.i(TAG,"owner onResume");
    }

    @Override
    protected void onDestroy( ) {
        super.onDestroy();
        Log.i(TAG,"owner onDestroy");
    }
}