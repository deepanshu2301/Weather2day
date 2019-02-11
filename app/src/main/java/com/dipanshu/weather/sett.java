package com.dipanshu.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class sett extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.source);

        if (getIntent() != null) {
            Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show();
        }
    }
}
